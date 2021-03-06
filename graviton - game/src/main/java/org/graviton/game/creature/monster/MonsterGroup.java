package org.graviton.game.creature.monster;

import lombok.Data;
import org.graviton.api.Creature;
import org.graviton.constant.Dofus;
import org.graviton.database.entity.EntityFactory;
import org.graviton.game.look.AbstractLook;
import org.graviton.game.look.enums.OrientationEnum;
import org.graviton.game.maps.GameMap;
import org.graviton.game.position.Location;
import org.graviton.game.statistics.common.Statistics;
import org.graviton.network.game.protocol.MonsterPacketFormatter;
import org.joda.time.Interval;

import java.util.Collection;
import java.util.Date;

/**
 * Created by Botan on 02/12/2016. 23:20
 */
@Data
public class MonsterGroup implements Creature {
    private final int id;
    private final Collection<Monster> monsters;
    private Date creation = new Date();
    private Location location;

    public MonsterGroup(int id, GameMap gameMap, short cell, Collection<Monster> monsters) {
        this.id = id;
        this.location = new Location(gameMap, cell, OrientationEnum.random());
        this.monsters = monsters;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getGm() {
        return MonsterPacketFormatter.gmMessage(this);
    }

    @Override
    public void send(String data) {

    }

    @Override
    public Location getLocation() {
        return this.location;
    }

    @Override
    public int getColor(byte color) {
        return 0;
    }

    @Override
    public Statistics getStatistics() {
        return null;
    }

    @Override
    public EntityFactory entityFactory() {
        return ((GameMap) location.getMap()).getEntityFactory();
    }

    @Override
    public AbstractLook look() {
        return null;
    }

    public short getCell() {
        return this.location.getCell().getId();
    }

    public OrientationEnum getOrientation() {
        return this.location.getOrientation();
    }

    public short getStarsPercent() {
        return (short) (new Interval(this.creation.getTime(), new Date().getTime()).toDuration().getStandardMinutes() * 20 / Dofus.STARS_TIME);
    }

}
