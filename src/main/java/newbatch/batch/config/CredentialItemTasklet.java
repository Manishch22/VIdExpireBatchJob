package newbatch.batch.config;

import java.io.Console;
import java.util.List;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import newbatch.dto.VidExpireDTO;
import newbatch.entity.Vid;
import newbatch.repository.VidRepo;

import java.util.ArrayList;

@Component
public class CredentialItemTasklet implements Tasklet{

	@Autowired
	private VidRepo vidRepo;
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception 
	{
		System.out.println("Hello World");
//		List<VidExpireDTO> expiredVids = getExpiredVids();
//	
//		
//				for(int i=0; i<=4; i++) {
//					
//					System.out.println(expiredVids);
//				}
//				
//		// List<NotificationsRecord>
//		// loop thorugh the above list
//		//  send notifications servicd (By calling the notification service)
	return null;
	}
	
	public List<VidExpireDTO> getExpiredVids()
	{
	   List<Vid> expiredVids = vidRepo.findByExpiryDTimes();
	   return null;
	
	}
}
