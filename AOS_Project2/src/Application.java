



public class Application {
	static MutualExclusionService obj = new MutualExclusionServiceImpl();
	
	static boolean canRaiseRequest= true;
    void application_start() throws InterruptedException {
        //Project1 obj = new Project1();
        //obj.cs_enter();
    	
    	int noOfRequests = 10;
    	
    	while(noOfRequests >0)
    	{
    		if(canRaiseRequest)
    		{
    			Thread.sleep(1000);
    		 obj.cs_enter();
    		 noOfRequests--;
    		}
    		
//    		if(noOfRequests==0)
//    		{
//    			break;
//    		}
    		
    		
    	}
    		
        
       
        //obj.cs_leave();
        //writeToFile();
        
    }
    
  /* void writeToFile()
    {
    	try {
    		 
			String content = "Process No:\t"+Project1.processNo+"has written to this file at \t"+System.currentTimeMillis();
 
			File file = new File("./config/SharedResource.txt");
			
			FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileLock lock = channel.lock(); 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			
			try {
	            lock = channel.tryLock();
	        } catch (OverlappingFileLockException e) {
	            // File is already locked in this thread or virtual machine
	        	e.printStackTrace();
	        }

	        // Release the lock
	        lock.release();

	        // Close the file
	        channel.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
    }*/
    

}