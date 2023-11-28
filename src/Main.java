public class Main {
    public static void main(String[] args) {

    Dogs perro1 = new Dogs();
    perro1.setCode("007");
    perro1.setName("Boo");
    perro1.setBirthDate("11/10/19");
    perro1.setNature(true);

    Person persona1 = new Person();
    persona1.setId("7000000F");
    persona1.setName("Alessandro");
    persona1.setSurname("Paucar");
    persona1.setPhone("600 000 000");

    Adoption adopcion1 = new Adoption();
    adopcion1.setCode("001.B.A");
    adopcion1.setAdoptDate("27/11/23");
    adopcion1.setAnimals(perro1);
    adopcion1.setPerson(persona1);

    System.out.println("La adopción " + adopcion1.getCode() + " se ha realizado el " + adopcion1.getAdoptDate());
    System.out.println("La perra adoptada es " + adopcion1.getAnimals().getName());
    System.out.println("La persona que ha adoptado es " + adopcion1.getPerson().getName() + " " + adopcion1.getPerson().getSurname());

    }
}