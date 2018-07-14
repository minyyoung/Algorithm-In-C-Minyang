# Algorithm-In-C-Minyang
Algorithm study for 'Kakao Code Festival'


## STUDY WITH THIS LECTURE
https://www.udemy.com/data-structures-and-algorithms-in-c/learn/v4/content


### Section: 0
intro

### Section: 1
<Introduction to Data structures and Algorithms>
  프로그램 개발 과정은 데이터를 효과적으로 보여주고 순서대로 개발하는 건데, 데이터를 효과적으로 represent할 때 Data Struct가 필요하고, step by step으로 개발할 때는 Algorithm이 필요합니다. 알고리즘의 시간을 측정하는 방법은 Experimental과 Analytical 방법이 있는데, Experimental 방법은 직접 시간을 재는 거라서 측정할 때 하드웨어 등에 따라 달라질 수 있습니다. Analytical 방법은 Asymptotic analysis 라고도 하는데, 걸리는 시간을 input size를 기준으로 측정하는 것입니다.
  Asymptotic analysis를 이용해 알고리즘의 유용성을 판단하기 위해서는 input의 크기가 커질 때 알고리즘이 어떻게 동작하는지(running time의 증가를 말하는 듯) 알아야 하는데 이때 사용할 수 있는 것이 Big O Notation입니다. (google searching ㄱ) Big O는 input의 크기가 n이라고 했을 때 이 알고리즘이 몇 번 실행되야 하는지를 나타냅니다. 이를 찾는 방법은 n을 가지고 가장 큰 단위(가령 n의 제곱이라던가, 자연수 k의 n 제곱이라던가, n! 라던가)를 가지고 나머지 상수나 계수를 날리는 방법으로 구합니다. (별로 안 어렵 ><)
  알고리즘에 따라서 Worst, Best, Average case analysis 가 있는데, worst를 많이 사용하고 best는 별 도움 안됩니다. Average는 구하기 힘듭니다.
  ADT(Abstract Data Types) 라는 것은 DS(Data Structure)와 다르게 알고리즘에서 사용할 수 있는 데이터 타입인데 구현해야 할 것을 정의해 놓은 것입니다. 인터페이스 같은 거고 stack에서는 이러이러한 메소드를 구현해야한다... 같은 것입니다. (구체적으로 어떻게 구현해야하는지는 강제하지 않습니다.)
