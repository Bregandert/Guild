    public abstract class Character implements Fighter{
        //Имя персонажа
        private String name;
        //Статы персонажа
        private int healthPoints;
        private int strength;
        private int agility;
        //Опыт и золото
        private int experiencePoints;
        private int gold;
        //Конструктор
        public Character(String name, int healthPoints, int strength, int agility, int experiencePoints, int gold) {
            this.name = name;
            this.healthPoints = healthPoints;
            this.strength = strength;
            this.agility = agility;
            this.experiencePoints = experiencePoints;
            this.gold = gold;
        }
        //Метод для ведения боя
        @Override
        public int attack() {
            if (agility > getRandomValue()) return strength * 2;
                else if (agility * 3 > getRandomValue()) return strength;
                    else return  0;
        }

        public String getName() {
            return name;
        }
        //Геттеры и сеттеры
        public void setName(String name) {
            this.name = name;
        }
        public int getHealthPoints() {
            return healthPoints;
        }
        public void setHealthPoints(int healthPoints) {
            this.healthPoints = healthPoints;
        }
        public int getStrength() {
            return strength;
        }
        public void setStrength(int strength) {
            this.strength = strength;
        }
        public int getDexterity() {
            return agility;
        }
        public void setDexterity(int dexterity) {
            this.agility = dexterity;
        }
        public int getExperiencePoints() {
            return experiencePoints;
        }
        public void setXp(int experiencePoints) {
            this.experiencePoints = experiencePoints;
        }
        public int getGold() {
            return gold;
        }
        public void setGold(int gold) {
            this.gold = gold;
        }
        private int getRandomValue() {
            return (int) (Math.random() * 100);
        }
        //Переопределяем вывод в консоль, чтобы выводилось имя и очки здоровья
        @Override
        public String toString() {
            return String.format("%s здоровье:%d", name, healthPoints);
        }
    }

