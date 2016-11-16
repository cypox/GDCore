package org.graviton.game.maps;

import lombok.Data;
import org.graviton.api.Creature;
import org.graviton.game.maps.cell.Cell;
import org.graviton.game.maps.cell.Trigger;
import org.graviton.game.maps.utils.CellLoader;
import org.graviton.network.game.protocol.GameProtocol;
import org.jooq.Record;

import java.util.Map;

import static com.google.common.collect.Maps.newConcurrentMap;
import static org.graviton.database.jooq.game.tables.Maps.MAPS;

/**
 * Created by Botan on 12/11/2016 : 17:55
 */
@Data
public class GameMap {
    private final int id;
    private final String date, key, data, places;
    private final byte width, height;

    private final Map<Short, Trigger> triggers = newConcurrentMap();
    private final Map<Short, Cell> cells = newConcurrentMap();

    private final Map<Integer, Creature> creatures = newConcurrentMap();

    private final String descriptionPacket;

    public GameMap(Record record) {
        this.id = record.get(MAPS.ID);

        this.date = record.get(MAPS.DATE);
        this.key = record.get(MAPS.KEY);
        this.data = record.get(MAPS.MAPDATA);
        this.places = record.get(MAPS.PLACES);

        this.width = record.get(MAPS.WIDTH);
        this.height = record.get(MAPS.HEIGTH);

        this.cells.putAll(CellLoader.parse(data));
        this.triggers.putAll(CellLoader.parseTrigger(record.get(MAPS.TRIGGERS)));

        this.descriptionPacket = GameProtocol.mapDataMessage(this.id, this.date, this.key);
    }

    public void enter(Creature creature) {
        this.creatures.put(creature.getId(), creature);
        send(GameProtocol.showCreatureMessage(creature.getGm()));
        creature.getLocation().setGameMap(this);
    }

    public void load(Creature creature) {
        creature.send(this.descriptionPacket);
        creature.send(GameProtocol.creatureChangeMapMessage(creature.getId()));
        creature.send(GameProtocol.mapLoadedSuccessfullyMessage());
    }

    public void send(String data) {
        this.creatures.values().forEach(creature -> creature.send(data));
    }

}