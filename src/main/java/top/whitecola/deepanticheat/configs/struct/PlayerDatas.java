package top.whitecola.deepanticheat.configs.struct;

import java.util.UUID;
import java.util.Vector;

public class PlayerDatas {

    class PlayerDataWrapper {
        public String uuid;
        public Vector<AttackWrapper> attackWrappers = new Vector<>();
        public Vector<ClickWrapper> clickWrappers = new Vector<>();
        public Vector<HurtWrapper> hurtWrappers = new Vector<>();
    }

    class AttackWrapper{
        long period;
        long attackTimes;
        long attackTotalDistance;
        long damagePlayerTimes;
        long stepTick;
        long rightClickTimes;
        long attackPacketTimes;
        long hurtTimes;
        long jumpTimes;
        long noAimingTimes;
        long averagePing;
        long averageTPS;
        long averageCPS;
        long totalRising;
        long swordBlockTotalTime;
        long totalVelocity;
        long putBlockTimes;
        long moveCameraTick;
    }

    class ClickWrapper{
        long period;
        long damageTimes;
    }

    class HurtWrapper{
        long period;
    }
}
