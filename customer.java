public class customer {
    int ID;
    String name;
    char geneder;

    public customer(int ID, String name, char geneder) {
        this.ID = ID;
        this.name = name;
      setGeneder(geneder);
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGeneder() {
        return geneder;
    }

    public void setId(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setGeneder(char geneder) {
        if (geneder == 'f' || geneder == 'm') {
            this.geneder = geneder;
        }
        else
            throw new RuntimeException("please enter gender as f or m ");
    }
    @Override
    public String toString() {
        return "customer{" +
                "id=" + ID +
                ", name='" + name + '\'' +
                ", geneder=" + geneder +
                '}';
    }
}
