import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class NumberRangeSummarizerImplementation implements NumberRangeSummarizer{

	@Override
	public Collection<Integer> collect(String input) {
		return Arrays.stream(input.split(",")).map(Integer::parseInt).collect(Collectors.toList());

	}

	@Override
	public String summarizeCollection(Collection<Integer> input) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
