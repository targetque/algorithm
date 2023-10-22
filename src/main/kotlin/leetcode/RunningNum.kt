package leetcode

class RunningSum {
    fun runningSum(nums : IntArray) : IntArray {
        var result = IntArray(nums.size)

        for(i in 0..nums.size -1) {
            if(i == 0) {
                result[i] = nums[i]
            } else {
                result[i] = nums[i] + result[i-1]
            }
        }
        return result
    }
    fun main(args: Array<String>) {
        var anyArray = intArrayOf(1,2,3,4)
        val run = RunningSum()
        println("@@"+run.runningSum(anyArray))
    }
}