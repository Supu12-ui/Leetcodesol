# Pairwise swap elements of a linked list
## Easy 
<div class="problem-statement">
                <p><a onclick="gtagHelperFunction('clickopen','salesevent_gsc_problemspage_promobanner')" href="https://practice.geeksforgeeks.org/summer-carnival-2022?utm_source=practiceproblems&amp;utm_medium=problemspromobanner&amp;utm_campaign=gsc22" target="_blank"></a></p><div style="margin: 14px 0px !important;" class="row"><a onclick="gtagHelperFunction('clickopen','salesevent_gsc_problemspage_promobanner')" href="https://practice.geeksforgeeks.org/summer-carnival-2022?utm_source=practiceproblems&amp;utm_medium=problemspromobanner&amp;utm_campaign=gsc22" target="_blank">             <div class="col-md-12" style="cursor:pointer;background: #EFF8F3 0% 0% no-repeat padding-box; display: flex; align-items: center; position:                 relative; padding: 1.5%; border-radius: 10px; display: inline-block; text-align: center; font-weight: 600; color: #333"> <img src="https://media.geeksforgeeks.org/img-practice/gcs2022thumbnail-1649059370.png" alt="Lamp" width="46" height="40" style="background: transparent 0% 0% no-repeat padding-box;opacity: 1; margin: 0 16px;" class="img-responsive"> Geeks Summer Carnival is LIVE NOW &nbsp; <i class="fa fa-external-link" aria-hidden="true"></i> </div></a></div><p><span style="font-size:18px">Given a singly linked list of size <strong>N</strong>. The task is to swap elements in the linked list pairwise.<br>
For example, if the input list is 1 2 3 4, the resulting list after swaps will be 2 1 4 3.<br>
<strong>Note</strong>: You need to swap the nodes, not only the data. If only data is swapped then driver will print -1.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>LinkedList: 1-&gt;2-&gt;2-&gt;4-&gt;5-&gt;6-&gt;7-&gt;8
<strong>Output: </strong>2&nbsp;1&nbsp;4&nbsp;2&nbsp;6&nbsp;5&nbsp;8&nbsp;7<strong>
Explanation: </strong>After swapping each pair
considering (1,2), (2, 4), (5, 6).. so
on as pairs, we get 2, 1, 4, 2, 6, 5,
8, 7 as a new linked list.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>LinkedList: 1-&gt;3-&gt;4-&gt;7-&gt;9-&gt;10-&gt;1
<strong>Output: 3</strong>&nbsp;1&nbsp;7&nbsp;4&nbsp;10&nbsp;9&nbsp;1<strong>
Explanation: </strong>After swapping each pair
considering (1,3), (4, 7), (9, 10).. so
on as pairs, we get 3, 1, 7, 4, 10, 9,
1 as a new linked list.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
The task is to complete the function&nbsp;<strong>pairWiseSwap</strong>() which takes the head node as the only argument and returns the head of modified linked list.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(1).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤&nbsp;10<sup>3</sup></span></p>
 <p></p>
            </div>