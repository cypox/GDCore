package org.graviton.game.alignment.type;

/**
 * Created by Botan on 12/11/2016 : 14:27
 */
public enum AlignmentType {
    NEUTRE,
    BONTARIEN,
    BRAKMARIEN,
    MERCENAIRE;

    public static AlignmentType get(byte id) {
        return values()[id];
    }
}
