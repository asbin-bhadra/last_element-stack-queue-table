// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.knoldus
import scala.annotation.tailrec
import java.util.EmptyStackException

class Stack{

    def push(inputList:List[Int],value:Int):List[Int]={
        @tailrec
        def pushElement(inputList:List[Int],value:Int,res:List[Int]):List[Int]={
            inputList match{

                // If empty stack found
                case Nil => res ::: List(value)
                // Add element in the last position
                case h :: Nil => res ::: List(value)
                // Iterate over the stack
                case h :: tail => pushElement(tail,value,res)
            }
        }
        pushElement(inputList,value,inputList)
    }

    def pop(inputList:List[Int]):List[Int]={
        @tailrec
        def popElement(inputList:List[Int],head:List[Int]):List[Int]={
            inputList match{

                // Throw EmptyStackException if empty stack found
                case Nil => throw new EmptyStackException()

                // If only one element found
                case h :: Nil => head

                // Iterate over the stack
                case h :: tail => popElement(tail, head ::: List(h))
            }
        }
        popElement(inputList,Nil)
    }

    def isEmpty(inputList:List[Int]):Boolean={
        inputList match{
            // If stack is empty
            case Nil => true
            // If stack is not empty
            case _ => false
        }
    }

    def peek(inputList:List[Int]):(Int)={

        @tailrec
        def peekElement(inputList:List[Int]): (Int) = {
            inputList match{
                // Last element of the stack
                case head :: Nil => (head)
                // Iterate over the stack
                case _ :: tail => peekElement(tail)
                // Throw EmptyStackException if empty stack found
                case _ => throw new EmptyStackException()
            }
        }

        peekElement(inputList)
    }

}
