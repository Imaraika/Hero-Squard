package box;

import java.util.ArrayList;

public class Squard {
    public int SqId;
    public String name_of_Squad;
    public int maximum_number;
    public String squardcause;

    private static ArrayList<box.Hero> squardIncluders= new ArrayList<>();
    public  static ArrayList<Squard> instances = new ArrayList<>();

     public Squard(String name_of_Squad ,int maximum_number, String cause){
         this.name_of_Squad = name_of_Squad;
         this.maximum_number = maximum_number;
         this.squardcause = cause;
         this.squardIncluders = new ArrayList<>();
         instances.add(this);
         this.SqId = instances.size();
     }

    public int getSqId() {
         return SqId;
     }
    public static Squard findBySqId(int id) {
         return instances.get(id-1);
     }
    public String getSquadName() {
         return name_of_Squad;
     }
    public int getSize() {
         return maximum_number;
     }
    public String getSqdCause() {
         return this.squardcause;
     }
    public static ArrayList<Squard> getInstances(){
         return instances;
     }
    public ArrayList<box.Hero> getSquadMembers(){
        return  squardIncluders;
    }
    public void setSquadMembers(box.Hero newMember) {
        squardIncluders.add(newMember);
    }
    public static void clearAllSquads(){
         instances.clear();
     }
    public void clearAllSquadMembers(){
         getSquadMembers().clear();
     }

    public static Squard setNewSquard(){
         return new Squard("Nyabugogo Data Promoters ",5,"data promoting");
     }
    public static Squard setUpNewSquad1(){
         return new Squard("Kicukiro Data Promoters",5,"data promoting");
     }

}

