	import java.io.IOException;
	import java.util.Calendar;
	import org.apache.hadoop.io.IntWritable;
	import org.apache.hadoop.io.LongWritable;
	import org.apache.hadoop.io.Text;
	import org.apache.hadoop.mapreduce.Mapper;
	import javax.xml.parsers.DocumentBuilder;
	import javax.xml.parsers.DocumentBuilderFactory;
	import java.io.StringReader;
	import org.xml.sax.InputSource;
	import org.w3c.dom.Document;
	import org.w3c.dom.Element;
	import javax.xml.parsers.ParserConfigurationException;
	import org.xml.sax.SAXException;


	public class HistogramMapper extends Mapper<Object, Text, IntWritable, IntWritable> {

		private final IntWritable one = new IntWritable(1);
		private IntWritable data = new IntWritable();

    public void map(Object key, Text values, Context context) throws IOException, InterruptedException {

    	String[] entry = values.toString().split("\\t");
    	data.set(Integer.parseInt(entry[1]));
		  context.write(data, one);

    }
}