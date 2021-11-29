package lesson7.lab1;

public class AnimalBuilder {
    private int MAX_SPEED;
    private int SPEED;
    private String defaultName;
    private Boolean flyable;

    public static class Builder{
        private int MAX_SPEED;
        private int SPEED;
        private String defaultName;
        private Boolean flyable;

        public Builder getMAX_SPEED(int MAX_SPEED){
            this.MAX_SPEED = MAX_SPEED;
            return this;
        }
        public Builder getSPEED(int SPEED){
            this.SPEED = SPEED;
            return this;
        }
        public Builder isFly(Boolean flyable){
            this.flyable = flyable;
            return this;
        }
        public Builder getdefaultName(String defaultName){
            this.defaultName = defaultName;
            return this;
        }
    }
}
