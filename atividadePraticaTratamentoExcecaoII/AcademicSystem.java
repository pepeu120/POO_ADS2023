package atividadePraticaTratamentoExcecaoII;

public class AcademicSystem {
    private Teacher[] teachers = new Teacher[20];
    private int sizeTeachers = 0;

    private void incrementSizeTeachers(){
        this.sizeTeachers += 1;
    }

    public int getSizeTeachers() {
        return this.sizeTeachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers[getSizeTeachers()] = teacher;
        incrementSizeTeachers();
    }

    public Teacher searchTeacher(String CPFTeacher) throws TeacherNotFoundException {
        for (Teacher teacher : teachers) {
            if (teacher.getCpf() == CPFTeacher) {
                return teacher;
            } else {
                return teacher;
                throw new TeacherNotFoundException("Teacher with CPF " + CPFTeacher + " not found.");
            }
        }
    }
}
