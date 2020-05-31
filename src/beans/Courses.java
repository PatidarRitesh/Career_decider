package beans;
public class Courses
{
    private int Course_id;
    
    private String Course_name , Course_duration ,Course_type;
    
    public int getCourse_id()
    {
        return Course_id;
        
    }
    
    public void setCourse_id(int Course_id)
            
    {
        
        this.Course_id=Course_id;
        
    }
    
    public String getCourse_name() {
	return Course_name;
}

public void setCourse_name(String Course_name) {
	this.Course_name = Course_name;
}

public String getCourse_duration() {
	return Course_duration;
}

public void setCourse_duration(String Course_duration) {
	this.Course_duration = Course_duration;
}

public String getCourse_type() {
	return Course_type;
}

public void setAns2(String Course_type) {
	this.Course_type = Course_type;
}



}
