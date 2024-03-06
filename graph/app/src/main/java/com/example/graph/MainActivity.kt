import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.graph.R
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val graph = findViewById<GraphView>(R.id.graph)

        // Create some data points
        val series = LineGraphSeries(arrayOf(
            DataPoint(0.0, 1.0),
            DataPoint(1.0, 5.0),
            DataPoint(2.0, 3.0),
            DataPoint(3.0, 2.0),
            DataPoint(4.0, 6.0)
        ))

        // Add the series to the graph
        graph.addSeries(series)
    }
}
