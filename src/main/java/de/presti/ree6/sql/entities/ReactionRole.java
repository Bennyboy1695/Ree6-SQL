package de.presti.ree6.sql.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * File to store Reaction-role information.
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "ReactionRole")
public class ReactionRole {

    /**
     * The PrimaryKey of the Entity.
     */
    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    /**
     * The ID of the Guild.
     */
    @Column(name = "gid")
    private long guildId;

    /**
     * The ID of the Emote used as reaction.
     */
    @Column(name = "emoteId")
    private long emoteId;

    /**
     * The formatted Emote.
     */
    @Column(name = "formattedEmote")
    private String formattedEmote = "";

    /**
     * The ID of the Channel.
     */
    @Column(name = "channelId")
    private long channelId = 0;

    /**
     * The ID of the Role used as reaction role.
     */
    @Column(name = "roleId")
    private long roleId;

    /**
     * The ID of the Message used as reaction message.
     */
    @Column(name = "messageId")
    private long messageId;

    /**
     * Constructor for the Reaction role.
     * @param guildId the GuildID.
     * @param emoteId the EmoteId.
     * @param roleId the Role ID.
     * @param messageId the Message ID.
     */
    public ReactionRole(long guildId, long emoteId, long roleId, long messageId) {
        this.guildId = guildId;
        this.emoteId = emoteId;
        this.roleId = roleId;
        this.messageId = messageId;
    }
}