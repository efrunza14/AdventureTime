package utiliz;

public class Constants {
    public static class Directions{
        public  static final int LEFT=0;
        public  static final int UP=1;
        public  static final int RIGHT=2;
        public  static final int DOWN=3;
    }
    public static class PlayerConstants{
        public static final int IDLE=0;
        public static final int RUN=1;
        public static final int JUMP=2;
        public static final int DEAD=3;
        public static final int SHOOT=4;
        public static final int MELEE=5;
        public static final int SLIDE=6;

        public static int GetSpriteAmount(int player_action){
            switch(player_action){
                case IDLE:
                    return 10;
                case RUN:
                    return 8;
                case JUMP:
                    return 10;
                case DEAD:
                    return 10;
                case SHOOT:
                    return 3;
                case MELEE:
                    return 7;
                case SLIDE:
                    return 5;
                default:
                    return 1;
            }
        }
    }
}
