/**
 * This class is generated by jOOQ
 */
package org.graviton.database.jooq;


import org.graviton.database.jooq.tables.Accounts;
import org.graviton.database.jooq.tables.Players;
import org.graviton.database.jooq.tables.Servers;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in login
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.8.5"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>login.accounts</code>.
     */
    public static final Accounts ACCOUNTS = org.graviton.database.jooq.tables.Accounts.ACCOUNTS;

    /**
     * The table <code>login.players</code>.
     */
    public static final Players PLAYERS = org.graviton.database.jooq.tables.Players.PLAYERS;

    /**
     * The table <code>login.servers</code>.
     */
    public static final Servers SERVERS = org.graviton.database.jooq.tables.Servers.SERVERS;
}