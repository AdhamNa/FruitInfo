package com.example.fruitsinfo


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var fruitAdapter: FruitAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycleView)
        if (resources.configuration.screenWidthDp > resources.configuration.smallestScreenWidthDp) {
            recyclerView.layoutManager = GridLayoutManager(this, 3)
        } else {
            recyclerView.layoutManager = GridLayoutManager(this, 2)
        }
        val listOFruits = getListOfFruits()
        fruitAdapter = FruitAdapter(listOFruits as ArrayList<FruitData>)
        recyclerView.adapter = fruitAdapter

    }

    private fun getListOfFruits(): MutableList<FruitData> {
        val fruits = mutableListOf<FruitData>()
        fruits.add(
            FruitData(
                "Orange",
                "Orange",
                R.drawable.orange_,
                "The orange is a usually round or oval citrus , its rind and flesh are generally orange, except the varieties of red pulp"
            )
        )
        fruits.add(
            FruitData(
                "Apple",
                "Red",
                R.drawable.apple_,
                "Apples at harvest vary widely in size, shape, colour, and acidity"
            )
        )
        fruits.add(
            FruitData(
                "Watermelon",
                "Green",
                R.drawable.watermelon_,
                "It has an oval or spherical shape and a dark green and smooth rind"
            )
        )
        fruits.add(
            FruitData(
                "Banana",
                "Yellow",
                R.drawable.banana_,
                "A banana is a curved, yellow fruit with a thick skin and soft sweet flesh"
            )
        )
        fruits.add(
            FruitData(
                "Pear",
                "Bale Yellow",
                R.drawable.pear_svgrepo_com,
                "Pear fruits are generally sweeter and of softer texture than apples "
            )
        )
        fruits.add(
            FruitData(
                "mango",
                "Bright Yellow",
                R.drawable.mango_,
                "The mango fruit is roughly oval in shape, with uneven sides"
            )
        )
        fruits.add(
            FruitData(
                "lemon",
                "Yellow",
                R.drawable.lemon_,
                "The lemon is a round, slightly elongated fruit"
            )
        )
        fruits.add(
            FruitData(
                "Pomegranate",
                "Red",
                R.drawable.pomegranate_,
                "The fruit is the size of a large orange, obscurely six-sided, with a smooth leathery skin that ranges from brownish yellow to red"
            )
        )
        fruits.add(
            FruitData(
                "Guava",
                "Bright yellow",
                R.drawable.food_guava_,
                "Guava has a slender trunk with smooth green to red-brown bark"
            )
        )
        fruits.add(
            FruitData(
                "Pineapple",
                "Yellow",
                R.drawable.pinapple_,
                "Pineapples have yellow or white pulp, fleshy, aromatic, juicy and sweet"
            )
        )
        fruits.add(
            FruitData(
                "Grape",
                "Purple",
                R.drawable.grapess,
                "fleshy, rounded fruits that grow in clusters made up of many fruits of greenish, yellowish or purple skin"
            )
        )
        fruits.add(
            FruitData(
                "Coconut",
                "Brown",
                R.drawable.coconut_01_svgrepo_com,
                "the fruit of a tropical palm plant. It has a hard shell, edible white flesh and clear liquid"
            )
        )
        fruits.add(
            FruitData(
                "Blackberries",
                "Black",
                R.drawable.blackberries_,
                "It is a black glossy berry-like fruit formed by multiple small fruits, each one containing a seed"
            )
        )
        fruits.add(
            FruitData(
                "Blueberries",
                "Blue",
                R.drawable.blueberries_,
                "Blueberries are small round berries about 0.2 to 0.6 inches across"
            )
        )
        fruits.add(
            FruitData(
                "Cherries",
                "Red",
                R.drawable.cherries_,
                "A fleshy drupe (stone fruit) that is generally heart-shaped to nearly globular, measures about 2 cm (1 inch) in diameter, and varies in colour from yellow through red to nearly black"
            )
        )
        fruits.add(
            FruitData(
                "Fig",
                "Purple",
                R.drawable.fig_svgrepo_com,
                "Edible fruit of Ficus carica, a species of small tree in the flowering plant family Moraceae"
            )
        )
        fruits.add(
            FruitData(
                "Kiwi",
                "Brown",
                R.drawable.kiwi_,
                "It has a thin, fuzzy, fibrous, tart but edible light brown skin and light green or golden flesh with rows of tiny, black, edible seeds"
            )
        )
        fruits.add(
            FruitData(
                "Strawberry",
                "Red",
                R.drawable.strawberry_,
                "Soft, sweet, bright red berries"
            )
        )
        fruits.add(
            FruitData(
                "Cantaloupe",
                "Tan green",
                R.drawable.melon_,
                "A type of melon with a tan-green rind"
            )
        )
        fruits.add(
            FruitData(
                "Avocado",
                "Bright green",
                R.drawable.avocado_,
                " bright green fruit with a large pit and dark leathery skin"
            )
        )
        return fruits


    }

}




