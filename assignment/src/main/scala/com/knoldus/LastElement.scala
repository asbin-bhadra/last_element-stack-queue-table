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

class LastElement{

    // Get last element using tail recusrion
    def getLastElement(inputList:List[Int]):(Int,Int)={

        @tailrec
        def last(inputList:List[Int],index:Int): (Int,Int) = {
            inputList match{
                // Last element of the list
                case head :: Nil => (head,index)
                // Iterate over the list
                case _ :: tail => last(tail,index + 1)
                // Throw NoSuchElementException if empty list found
                case _ => throw new NoSuchElementException("Empty List")
            }
        }

        last(inputList,0)
    }
}
