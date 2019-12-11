
package studentAction;

import Dao.StudentDao;
import PO.Stuinfo;
import com.opensymphony.xwork2.ActionSupport;
import javax.swing.JOptionPane;

public class UpdateMessageAction extends ActionSupport{
    private String id;
    private String name;
    private String sex;
    private int age;
    private float weight;
    private String message="input";
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void validate(){
        if(this.getName()==null||this.getName().length()==0){
            addFieldError("name","姓名不允许为空!");
        }
        if(this.getAge()>130){
            addFieldError("age","请认真核实年龄！");
        }
        if(this.getWeight()>500){
            addFieldError("weight","请认真核实体重！");
        }
    }
    public String execute() throws Exception{
        StudentDao dao=new StudentDao();
        boolean update=dao.updateInfo(info());
        if(update){
            message="success";
        }
        return message;
    }
    public Stuinfo info(){
        Stuinfo info=new Stuinfo();
        info.setId(this.getId());
        info.setName(this.getName());
        info.setSex(this.getSex());
        info.setAge(this.getAge());
        info.setWeight(this.getWeight());
        return info;
    }
    public void message(String mess){
        int type=JOptionPane.YES_NO_OPTION;
        String title="提示信息";
        JOptionPane.showMessageDialog(null, mess, title, type);
    }
}
