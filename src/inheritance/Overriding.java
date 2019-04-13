package inheritance;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Overriding extends AbstractOverride {
	String var = "overriding var";

	public void printText() throws IOException {
		System.out.println("print text Overriding" + " " + var);
	}

	public void printText(Object obj) throws IOException {
		System.out.println("Object" + " " + obj);
	}

	public void printText(String str) throws IOException {
		System.out.println("String" + " " + str);
	}

	static class IneerOverriding extends Overriding {
		String var = "innerOverriding var";

		public void printText() {
			System.out.println("print text Overriding" + " " + var);
		}
	}

	public Overriding() {
		super();
	}

	public Overriding(String str) {
		this.var = str;
	}

	@Override
	public int hashCode() {
		return 42;
	}

	public static void print(long a) {
		System.out.println("long");
	}

	public static void print(Long a) {
		System.out.println("LONG");
	}

	public void empty() {
	}

	public static void main(String[] args) throws Exception {
		Overriding overriding = new Overriding();
		overriding.printText();
		Object obj = new String("object");
		overriding.printText(obj);
		String str = new String("String");
		overriding.printText(str);
		Overriding overriding1 = new IneerOverriding();
		overriding1.printText();
		Overriding over = new Overriding("1");
		Overriding over2 = new Overriding("2");
		Overriding over3 = new Overriding("3");
		System.out.println(over);
		System.out.println(over2 instanceof Overriding);
		System.out.println(Paths.get("/bats/night", "../").resolve(Paths.get("./sleep.txt")).normalize());
		print(new Integer(2));
		Supplier<StringBuilder> s1 = () -> new StringBuilder("ff");
		System.out.println(s1);
		System.out.println(ZonedDateTime.now());
		System.out.println(
				ZoneId.getAvailableZoneIds().stream().filter(s ->s.contains("Europe") && s.contains("K")).
				//forEach(System.out::println);
				collect(Collectors.toList()));
		LocalDateTime ldt = LocalDateTime.of(2016,Month.MARCH, 13, 2,30,0);
		ZonedDateTime zon = ZonedDateTime.of(ldt, ZoneId.of("US/Eastern"));
		Instant inst = Instant.now();
		System.out.println(zon);
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4,3,52));
		for(Integer item: list) {
		System.out.print(item+" ");
		list.add(9);
		}
		System.out.println();
		System.out.println("Size: "+list.size());
		list.stream().forEach(System.out::print);
		ExecutorService service = Executors.newSingleThreadScheduledExecutor();
		Future<?> result = service.submit(() -> System.out.println("Wake Staff"));
		System.out.println("                  "+System.getProperty("file.separator"));
		
//		List<String> file = Files.readAllLines(Paths.get("F:\\Files\\Getting Started.docx"),  Charset.forName("ISO_8859_1"));
//		file.forEach(System.out::println);
//		System.out.println(Files.readAttributes(Paths.get("F:\\Files\\Getting Started.docx"),BasicFileAttributes.class).creationTime());

		Path path = Paths.get("/user/.././root","../kodiacbear.txt");
		path.normalize().relativize(Paths.get("/lion"));
		LocalDateTime testDateTime = LocalDateTime.of(2017, 8, 31, 12, 0, 0,0);
		System.out.println(new Timestamp(testDateTime.toInstant(ZoneOffset.of("+03:00")).toEpochMilli()));
		System.out.println(TimeZone.getDefault().getID());
	
	}

	@Override
	public void someMethod() throws IOException {
					
	}
	
}
