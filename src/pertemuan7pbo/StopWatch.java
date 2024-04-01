package pertemuan7pbo;

/*
Danis (2207275)
*/

public class StopWatch 
{
    //deklarasi atribut
    private long startTime;
    private long endTime;
    
    //get method
    public long getStartTime()
    {
        return startTime;
    }
    
    public long getEndTime () 
    {
        return endTime;
    }
    
    //konstructor yang menginisialisasi startTime dengan wakti saat ini
    public StopWatch() 
    {
        this.startTime = System.currentTimeMillis();
    }
    
    //method start dan stop, yang menyetel ke waktu saat ini
    public void start() 
    {
        this.startTime = System.currentTimeMillis();
    }
    
    public void stop()
    {
        this.endTime = System.currentTimeMillis();
    }
    
    //method getElapsedTime, yang mengembalikan waktu yang telah berlalu untuk stopwatch dalam milidetik.
    
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
    
}
