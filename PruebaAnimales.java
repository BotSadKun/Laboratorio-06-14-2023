abstract class Animal {
    protected String sonidos;
    protected String alimentos;
    protected String hábitat;
    protected String nombreCientífico;

    public Animal(String sonidos, String alimentos, String hábitat, String nombreCientífico) {
        this.sonidos = sonidos;
        this.alimentos = alimentos;
        this.hábitat = hábitat;
        this.nombreCientífico = nombreCientífico;
    }

    public abstract String getNombreCientífico();

    public abstract String getSonido();

    public abstract String getAlimentos();

    public abstract String getHábitat();
}

class Cánidos extends Animal {
    public Cánidos(String sonidos, String alimentos, String hábitat, String nombreCientífico) {
        super(sonidos, alimentos, hábitat, nombreCientífico);
    }

    @Override
    public String getNombreCientífico() {
        return super.nombreCientífico;
    }

    @Override
    public String getSonido() {
        return super.sonidos;
    }

    @Override
    public String getAlimentos() {
        return super.alimentos;
    }

    @Override
    public String getHábitat() {
        return super.hábitat;
    }
}

class Felinos extends Animal {
    public Felinos(String sonidos, String alimentos, String hábitat, String nombreCientífico) {
        super(sonidos, alimentos, hábitat, nombreCientífico);
    }

    @Override
    public String getNombreCientífico() {
        return super.nombreCientífico;
    }

    @Override
    public String getSonido() {
        return super.sonidos;
    }

    @Override
    public String getAlimentos() {
        return super.alimentos;
    }

    @Override
    public String getHábitat() {
        return super.hábitat;
    }
}

class Perro extends Cánidos {
    public Perro() {
        super("ladrido", "carnívora", "doméstico", "Canis lupus familiaris");
    }
}

class Lobo extends Cánidos {
    public Lobo() {
        super("aullido", "carnívora", "bosque", "Canis lupus");
    }
}

class León extends Felinos {
    public León() {
        super("rugido", "carnívora", "pradera", "Panthera leo");
    }
}

class Gato extends Felinos {
    public Gato() {
        super("maullido", "ratones", "doméstico", "Felis silvestris catus");
    }
}

public class PruebaAnimales {
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];
        animales[0] = new Perro();
        animales[1] = new Lobo();
        animales[2] = new León();
        animales[3] = new Gato();

        for (Animal animal : animales) {
            System.out.println("Nombre Científico: " + animal.getNombreCientífico());
            System.out.println("Sonido: " + animal.getSonido());
            System.out.println("Alimentos: " + animal.getAlimentos());
            System.out.println("Hábitat: " + animal.getHábitat());
            System.out.println();
        }
    }
}
