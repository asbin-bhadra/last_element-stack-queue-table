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

class Queue{
    def enqueue(inputList:List[Int],value:Int):List[Int]={
        value :: inputList
    }

    def dequeue(inputList:List[Int]):List[Int]={
        @tailrec
        def removeElement(inputList:List[Int],head:List[Int]):List[Int]={
            inputList match{

                // Throw NoSuchElementException if queue is empty
                case Nil => throw new NoSuchElementException()

                // If only one element is there
                case h :: Nil => head

                // If there is multiple element in the queue
                case h :: tail => removeElement(tail, head ::: List(h))
            }
        }
        removeElement(inputList,Nil)
    }
    def isEmpty(inputList:List[Int]):Boolean={
        inputList match{
            // If empty stack found
            case Nil => true

            // If non empty stack found
            case _ => false
        }
    }

    def peek(inputList:List[Int]):(Int)={

        inputList match{
            // Iterate over the list
            case head:: _ => head
            // Throw NoSuchElementException if empty list found
            case _ => throw new NoSuchElementException()
        }
    }
}
