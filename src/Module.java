public class Module {
    private int Module_ID;

    private String ModuleName;

    private String LectureName;

    public int getModule_ID() {
        return Module_ID;
    }

    public String getModuleName() {
        return ModuleName;
    }

    public String getLectureName() {
        return LectureName;
    }

    public void setModule_ID(int module_ID) {
        Module_ID = module_ID;
    }

    public void setModuleName(String moduleName) {
        ModuleName = moduleName;
    }

    public void setLectureName(String lectureName) {
        LectureName = lectureName;
    }


    public Module(int module_ID, String moduleName, String lectureName) {
        Module_ID = module_ID;
        ModuleName = moduleName;
        LectureName = lectureName;
    }

    public  void PrintModule(){
        System.out.println("Module ID : " + getModule_ID());
        System.out.println("Module Name : " +getModuleName());
        System.out.println("Leacture Name : "+getLectureName());

    }


}
