package abstractFactory;

public class Demo {
    public static void main(String[] args) {
        generarFamiliaRelacional();
        generarFamiliaNoSQL();
    }

    private static void generarFamiliaRelacional() {
        System.out.println("-----------------------------------------");
        System.out.println("Vamos a generar una familia relacional");
        final AbstractFactory familia = new FactoryRelacional();
        final AlumnoRepo alumnoRepo = familia.createAlumnoRepo();
        final CursoRepo cursoRepo = familia.createCursoRepo();
        System.out.println("La instancia de AlumnoRepo obtenida es de tipo: " + alumnoRepo.getClass().getSimpleName());
        System.out.println("La instancia de CursoRepo obtenida es de tipo: " + cursoRepo.getClass().getSimpleName());
        System.out.println("-----------------------------------------");
    }

    private static void generarFamiliaNoSQL() {
        System.out.println("-----------------------------------------");
        System.out.println("Vamos a generar una familia no-sql");
        final AbstractFactory familia = new FactoryNoSql();
        final AlumnoRepo alumnoRepo = familia.createAlumnoRepo();
        final CursoRepo cursoRepo = familia.createCursoRepo();
        System.out.println("La instancia de AlumnoRepo obtenida es de tipo: " + alumnoRepo.getClass().getSimpleName());
        System.out.println("La instancia de CursoRepo obtenida es de tipo: " + cursoRepo.getClass().getSimpleName());
        System.out.println("-----------------------------------------");
    }
}
