package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.EligibilityDetails;
import in.ashokit.repo.EligibilityDetailsRepo;

@Component
public class AppRunner implements ApplicationRunner {
	
	@Autowired
	private EligibilityDetailsRepo repo;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
	EligibilityDetails entity1 = new EligibilityDetails();
	entity1.setEligId(1);
	entity1.setName("John");
	entity1.setEmail("john@gmail.com");
	entity1.setMobile((long) 889099000);
	entity1.setGender('M');
	entity1.setSsn((long) 87678789);
	entity1.setPlanName("SNAP");
	entity1.setPlanStatus("Approved");
	repo.save(entity1);
	
	EligibilityDetails entity2 = new EligibilityDetails();
	entity2.setEligId(2);
	entity2.setName("Robert");
	entity2.setEmail("robert@gmail.com");
	entity2.setMobile((long) 889099000);
	entity2.setGender('M');
	entity2.setSsn((long) 87678789);
	entity2.setPlanName("Medicaid");
	entity2.setPlanStatus("Closed");
	repo.save(entity2);
	
	EligibilityDetails entity3 = new EligibilityDetails();
	entity3.setEligId(3);
	entity3.setName("Smith");
	entity3.setEmail("smith@gmail.com");
	entity3.setMobile((long) 889099000);
	entity3.setGender('M');
	entity3.setSsn((long) 87678789);
	entity3.setPlanName("CCAP");
	entity3.setPlanStatus("Denied");
	repo.save(entity3);
		
	}
       
}
