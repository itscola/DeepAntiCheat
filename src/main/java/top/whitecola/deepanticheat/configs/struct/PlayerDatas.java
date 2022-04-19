package top.whitecola.deepanticheat.configs.struct;

import java.util.UUID;
import java.util.Vector;

public class PlayerDatas {

    class PlayerDataWrapper {
        public String uuid;
        public Vector<AttackWrapper> attackWrappers = new Vector<>();
        public Vector<ClickWrapper> clickWrappers = new Vector<>();
    }

    class AttackWrapper{
        long period;
        long attackTimes;
        long attackTotalDistance;
        long damagePlayerTimes;
        long steps;
        long rightClickTimes;
    }

    class ClickWrapper{
        long period;
        long damageTimes;
    }
}
