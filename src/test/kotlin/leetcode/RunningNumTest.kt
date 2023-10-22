package leetcode

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.*

class leetcode {


    val run = RunningSum()
    @Test
    fun 배열에_대한_인자값에_맞는_리턴값이_명확하게_내려오는가() {

        var anyArray = intArrayOf(1,2,3,4)
        assertThat(run.runningSum(anyArray)).isEqualTo(intArrayOf(1,3,6,10))
    }

}