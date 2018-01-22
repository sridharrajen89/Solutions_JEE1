package ex5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;



public class WritingJAXBDemo {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			JAXBContext context=JAXBContext.newInstance("ex4");
			
			ObjectFactory obj=new ObjectFactory();
			
			JourneyType journey = obj.createJourneyType();
			List<StationType> stations = journey.getStation();
			StationType station = obj.createStationType();
			station.setNum("T3");
			station.setName("Vijayawada");
			station.setArrivalTime("11am");
			station.setDepatureTime("12pm");
			stations.add(station);
			
			StationType station1 = obj.createStationType();
			station1.setNum("T4");
			station1.setName("Annavaram");
			station1.setArrivalTime("12am");
			station1.setDepatureTime("1pm");
			stations.add(station1);
			
			journey.setStation(stations);
			
			TrainType train=obj.createTrainType();
			train.setNo("TR12578");
			train.setTrainName("Goutami");
			train.setFrom("Kakinada");
			train.setTo("Hyderabad");
			train.setJourneyInfo(journey);
			
			System.out.println(train);
			
			
			TrainsType trains = obj.createTrainsType();
			List<TrainType> TrainsList=trains.getTrain();
			TrainsList.add(train);
			
			trains.setTrain(TrainsList);
			
			JAXBElement<TrainsType> newTrain = obj.createTrains(trains);
			
			Marshaller marshaller=context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(newTrain, new FileOutputStream("src/ex4/trains.xml",true));
			System.out.println("Serialized");
			
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
