package model.room.enums;

/**
 * @author Karim Elbawab
 * here i am making sure that there are only two types of rooms available
 * either single or double 
 */


    
    
    public enum RoomType {
        SINGLE("1"),
        DOUBLE("2");
    
        public final String label;
    
        private RoomType(String label) {
            this.label = label;
        }
    
        public static RoomType valueOfLabel(String label) {
            for (RoomType roomType : values()) {
                if (roomType.label.equals(label)) {
                    return roomType;
                }
            }
            // Just in case the customer selected anything other than 1 or 2
            throw new IllegalArgumentException();
        }
    }
    

