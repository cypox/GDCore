/**
 * This class is generated by jOOQ
 */
package org.graviton.database.jooq.login.tables.records;


import org.graviton.database.jooq.login.tables.Accounts;
import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Record3;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.8.5"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AccountsRecord extends UpdatableRecordImpl<AccountsRecord> implements Record14<Integer, String, String, String, String, String, Byte, Byte, Byte, Integer, String, String, String, Byte> {

    private static final long serialVersionUID = -2075529095;

    /**
     * Create a detached AccountsRecord
     */
    public AccountsRecord() {
        super(Accounts.ACCOUNTS);
    }

    /**
     * Create a detached, initialised AccountsRecord
     */
    public AccountsRecord(Integer id, String name, String password, String nickname, String question, String answer, Byte rights, Byte banned, Byte muted, Integer points, String channels, String lastConnection, String lastAddress, Byte friendNotificationListener) {
        super(Accounts.ACCOUNTS);

        set(0, id);
        set(1, name);
        set(2, password);
        set(3, nickname);
        set(4, question);
        set(5, answer);
        set(6, rights);
        set(7, banned);
        set(8, muted);
        set(9, points);
        set(10, channels);
        set(11, lastConnection);
        set(12, lastAddress);
        set(13, friendNotificationListener);
    }

    /**
     * Getter for <code>login.accounts.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>login.accounts.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>login.accounts.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>login.accounts.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>login.accounts.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>login.accounts.password</code>.
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>login.accounts.nickname</code>.
     */
    public String getNickname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>login.accounts.nickname</code>.
     */
    public void setNickname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>login.accounts.question</code>.
     */
    public String getQuestion() {
        return (String) get(4);
    }

    /**
     * Setter for <code>login.accounts.question</code>.
     */
    public void setQuestion(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>login.accounts.answer</code>.
     */
    public String getAnswer() {
        return (String) get(5);
    }

    /**
     * Setter for <code>login.accounts.answer</code>.
     */
    public void setAnswer(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>login.accounts.rights</code>.
     */
    public Byte getRights() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>login.accounts.rights</code>.
     */
    public void setRights(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>login.accounts.banned</code>.
     */
    public Byte getBanned() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>login.accounts.banned</code>.
     */
    public void setBanned(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>login.accounts.muted</code>.
     */
    public Byte getMuted() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>login.accounts.muted</code>.
     */
    public void setMuted(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>login.accounts.points</code>.
     */
    public Integer getPoints() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>login.accounts.points</code>.
     */
    public void setPoints(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>login.accounts.channels</code>.
     */
    public String getChannels() {
        return (String) get(10);
    }

    /**
     * Setter for <code>login.accounts.channels</code>.
     */
    public void setChannels(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>login.accounts.last_connection</code>.
     */
    public String getLastConnection() {
        return (String) get(11);
    }

    /**
     * Setter for <code>login.accounts.last_connection</code>.
     */
    public void setLastConnection(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>login.accounts.last_address</code>.
     */
    public String getLastAddress() {
        return (String) get(12);
    }

    /**
     * Setter for <code>login.accounts.last_address</code>.
     */
    public void setLastAddress(String value) {
        set(12, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>login.accounts.friend_notification_listener</code>.
     */
    public Byte getFriendNotificationListener() {
        return (Byte) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>login.accounts.friend_notification_listener</code>.
     */
    public void setFriendNotificationListener(Byte value) {
        set(13, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<Integer, String, String> key() {
        return (Record3) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, String, String, String, String, String, Byte, Byte, Byte, Integer, String, String, String, Byte> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, String, String, String, String, String, Byte, Byte, Byte, Integer, String, String, String, Byte> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Accounts.ACCOUNTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Accounts.ACCOUNTS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Accounts.ACCOUNTS.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Accounts.ACCOUNTS.NICKNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Accounts.ACCOUNTS.QUESTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Accounts.ACCOUNTS.ANSWER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return Accounts.ACCOUNTS.RIGHTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return Accounts.ACCOUNTS.BANNED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return Accounts.ACCOUNTS.MUTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Accounts.ACCOUNTS.POINTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Accounts.ACCOUNTS.CHANNELS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Accounts.ACCOUNTS.LAST_CONNECTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Accounts.ACCOUNTS.LAST_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field14() {
        return Accounts.ACCOUNTS.FRIEND_NOTIFICATION_LISTENER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getNickname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getQuestion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAnswer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getRights();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getBanned();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getMuted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getPoints();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getChannels();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getLastConnection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getLastAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value14() {
        return getFriendNotificationListener();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value3(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value4(String value) {
        setNickname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value5(String value) {
        setQuestion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value6(String value) {
        setAnswer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value7(Byte value) {
        setRights(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value8(Byte value) {
        setBanned(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value9(Byte value) {
        setMuted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value10(Integer value) {
        setPoints(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value11(String value) {
        setChannels(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value12(String value) {
        setLastConnection(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value13(String value) {
        setLastAddress(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value14(Byte value) {
        setFriendNotificationListener(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Byte value7, Byte value8, Byte value9, Integer value10, String value11, String value12, String value13, Byte value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }
}
