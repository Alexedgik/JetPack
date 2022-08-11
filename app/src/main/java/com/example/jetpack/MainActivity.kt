package com.example.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Modifier


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                itemsIndexed(
                    listOf(
                        ItemRowModel(R.drawable.egor, "Миша", "textjkhnjklnvslkdnvsldknvs" +
                                "jkosdlvjnlsdknmvlks;kjn'lkjre'lkjnvbl';kl" +
                                "hbjk;lark;jhjk;djfhsd;lkjhrfjk;lrjkh;jkr" +
                                "kjrhfgh;ejkfhw;kjhgj;wkerjhgerjwk;rkjghwk" +
                                "jklghfalskjgh;kerajgher;kjfgvn;kaejrnjk;erhng" +
                                "rgkejah;kjhrkjn;vkj;ekjnrjg;akjrngje;kjrngjkr"),
                        ItemRowModel(R.drawable.andrey, "Саша", "text"),
                        ItemRowModel(R.drawable.sergey, "Петя", "text"),
                        ItemRowModel(R.drawable.dula, "ОПА", "text"),
                        ItemRowModel(R.drawable.egor, "Сеня", "text"),
                        )
                ){ _, item, ->
                    MyRow(item = item)
                }

            }
        }
    }
}





