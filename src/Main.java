public class Main {
    public static void main(String[] args) {

        InstructorManager instructorManager = new InstructorManager();
        Instructor instructor1 = new Instructor(2, "Eren"," Geneci", "eren@example.com", "Java");
        instructorManager.add(instructor1);
        instructorManager.getAll().forEach(System.out::println);
        System.out.println("----------------------------------");
        var item= instructorManager.getById(2);
        System.out.println(item);
        instructorManager.delete(instructor1);
        System.out.println("Silme işleminden sonra eğitmenler:");
        for (Instructor i : instructorManager.getAll()) {
            System.out.println(i);
            System.out.println("----------------------------------");
        instructorManager.getAll().forEach(System.out::println);
    }
}}