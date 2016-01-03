package ru.jts_dev.gameserver.packets.in;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.jts_dev.common.packets.IncomingMessageWrapper;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

/**
 * @author Camelion
 * @since 03.01.16
 */
@Component
@Scope(SCOPE_PROTOTYPE)
public class EnterWorld extends IncomingMessageWrapper {
    @Override
    public void prepare() {

    }

    @Override
    public void run() {
        // TODO: 03.01.16 ItemList packet, ShortCutInit, BookMarkInfo, BasicAction, QuestList, EtcStatusUpdate, StorageMaxCount, FriendList,
        // TODO: 03.01.16 System Message : Welcome to Lineage, SkillCoolTime, ExVoteSystemInfo, Spawn player
    }
}
