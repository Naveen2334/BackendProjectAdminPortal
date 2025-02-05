
<!DOCTYPE html><html><head><meta charset="utf-8"><meta name="viewport" content="width=device-width, initial-scale=1"><style>@font-face {
  font-family: octicons-anchor;
  src: url(https://cdnjs.cloudflare.com/ajax/libs/octicons/4.4.0/font/octicons.woff) format('woff');
}

* {
    box-sizing: border-box;
}

body {
    width: 980px;
    margin-right: auto;
    margin-left: auto;
    color:#333;
    background:#fff;
}

body .markdown-body {
    padding: 45px;
    border: 1px solid #ddd;
    border-radius: 3px;
    word-wrap: break-word;
}

pre {
    font: 12px Consolas, "Liberation Mono", Menlo, Courier, monospace;
}

.markdown-body {
  -webkit-text-size-adjust: 100%;
  text-size-adjust: 100%;
  color: #333;
  font-family: "Helvetica Neue", Helvetica, "Segoe UI", Arial, freesans, sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
  font-size: 16px;
  line-height: 1.6;
  word-wrap: break-word;
}

.markdown-body a {
  background-color: transparent;
}

.markdown-body a:active,
.markdown-body a:hover {
  outline: 0;
}

.markdown-body strong {
  font-weight: bold;
}

.markdown-body h1 {
  font-size: 2em;
  margin: 0.67em 0;
}

.markdown-body img {
  border: 0;
}

.markdown-body hr {
  box-sizing: content-box;
  height: 0;
}

.markdown-body pre {
  overflow: auto;
}

.markdown-body code,
.markdown-body kbd,
.markdown-body pre {
  font-family: monospace, monospace;
  font-size: 1em;
}

.markdown-body input {
  color: inherit;
  font: inherit;
  margin: 0;
}

.markdown-body html input[disabled] {
  cursor: default;
}

.markdown-body input {
  line-height: normal;
}

.markdown-body input[type="checkbox"] {
  box-sizing: border-box;
  padding: 0;
}

.markdown-body table {
  border-collapse: collapse;
  border-spacing: 0;
}

.markdown-body td,
.markdown-body th {
  padding: 0;
}

.markdown-body input {
  font: 13px / 1.4 Helvetica, arial, nimbussansl, liberationsans, freesans, clean, sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
}

.markdown-body a {
  color: #4078c0;
  text-decoration: none;
}

.markdown-body a:hover,
.markdown-body a:active {
  text-decoration: underline;
}

.markdown-body hr {
  height: 0;
  margin: 15px 0;
  overflow: hidden;
  background: transparent;
  border: 0;
  border-bottom: 1px solid #ddd;
}

.markdown-body hr:before {
  display: table;
  content: "";
}

.markdown-body hr:after {
  display: table;
  clear: both;
  content: "";
}

.markdown-body h1,
.markdown-body h2,
.markdown-body h3,
.markdown-body h4,
.markdown-body h5,
.markdown-body h6 {
  margin-top: 15px;
  margin-bottom: 15px;
  line-height: 1.1;
}

.markdown-body h1 {
  font-size: 30px;
}

.markdown-body h2 {
  font-size: 21px;
}

.markdown-body h3 {
  font-size: 16px;
}

.markdown-body h4 {
  font-size: 14px;
}

.markdown-body h5 {
  font-size: 12px;
}

.markdown-body h6 {
  font-size: 11px;
}

.markdown-body blockquote {
  margin: 0;
}

.markdown-body ul,
.markdown-body ol {
  padding: 0;
  margin-top: 0;
  margin-bottom: 0;
}

.markdown-body ol ol,
.markdown-body ul ol {
  list-style-type: lower-roman;
}

.markdown-body ul ul ol,
.markdown-body ul ol ol,
.markdown-body ol ul ol,
.markdown-body ol ol ol {
  list-style-type: lower-alpha;
}

.markdown-body dd {
  margin-left: 0;
}

.markdown-body code {
  font-family: Consolas, "Liberation Mono", Menlo, Courier, monospace;
  font-size: 12px;
}

.markdown-body pre {
  margin-top: 0;
  margin-bottom: 0;
  font: 12px Consolas, "Liberation Mono", Menlo, Courier, monospace;
}

.markdown-body .select::-ms-expand {
  opacity: 0;
}

.markdown-body .octicon {
  font: normal normal normal 16px/1 octicons-anchor;
  display: inline-block;
  text-decoration: none;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

.markdown-body .octicon-link:before {
  content: '\f05c';
}

.markdown-body:before {
  display: table;
  content: "";
}

.markdown-body:after {
  display: table;
  clear: both;
  content: "";
}

.markdown-body>*:first-child {
  margin-top: 0 !important;
}

.markdown-body>*:last-child {
  margin-bottom: 0 !important;
}

.markdown-body a:not([href]) {
  color: inherit;
  text-decoration: none;
}

.markdown-body .anchor {
  display: inline-block;
  padding-right: 2px;
  margin-left: -18px;
}

.markdown-body .anchor:focus {
  outline: none;
}

.markdown-body h1,
.markdown-body h2,
.markdown-body h3,
.markdown-body h4,
.markdown-body h5,
.markdown-body h6 {
  margin-top: 1em;
  margin-bottom: 16px;
  font-weight: bold;
  line-height: 1.4;
}

.markdown-body h1 .octicon-link,
.markdown-body h2 .octicon-link,
.markdown-body h3 .octicon-link,
.markdown-body h4 .octicon-link,
.markdown-body h5 .octicon-link,
.markdown-body h6 .octicon-link {
  color: #000;
  vertical-align: middle;
  visibility: hidden;
}

.markdown-body h1:hover .anchor,
.markdown-body h2:hover .anchor,
.markdown-body h3:hover .anchor,
.markdown-body h4:hover .anchor,
.markdown-body h5:hover .anchor,
.markdown-body h6:hover .anchor {
  text-decoration: none;
}

.markdown-body h1:hover .anchor .octicon-link,
.markdown-body h2:hover .anchor .octicon-link,
.markdown-body h3:hover .anchor .octicon-link,
.markdown-body h4:hover .anchor .octicon-link,
.markdown-body h5:hover .anchor .octicon-link,
.markdown-body h6:hover .anchor .octicon-link {
  visibility: visible;
}

.markdown-body h1 {
  padding-bottom: 0.3em;
  font-size: 2.25em;
  line-height: 1.2;
  border-bottom: 1px solid #eee;
}

.markdown-body h1 .anchor {
  line-height: 1;
}

.markdown-body h2 {
  padding-bottom: 0.3em;
  font-size: 1.75em;
  line-height: 1.225;
  border-bottom: 1px solid #eee;
}

.markdown-body h2 .anchor {
  line-height: 1;
}

.markdown-body h3 {
  font-size: 1.5em;
  line-height: 1.43;
}

.markdown-body h3 .anchor {
  line-height: 1.2;
}

.markdown-body h4 {
  font-size: 1.25em;
}

.markdown-body h4 .anchor {
  line-height: 1.2;
}

.markdown-body h5 {
  font-size: 1em;
}

.markdown-body h5 .anchor {
  line-height: 1.1;
}

.markdown-body h6 {
  font-size: 1em;
  color: #777;
}

.markdown-body h6 .anchor {
  line-height: 1.1;
}

.markdown-body p,
.markdown-body blockquote,
.markdown-body ul,
.markdown-body ol,
.markdown-body dl,
.markdown-body table,
.markdown-body pre {
  margin-top: 0;
  margin-bottom: 16px;
}

.markdown-body hr {
  height: 4px;
  padding: 0;
  margin: 16px 0;
  background-color: #e7e7e7;
  border: 0 none;
}

.markdown-body ul,
.markdown-body ol {
  padding-left: 2em;
}

.markdown-body ul ul,
.markdown-body ul ol,
.markdown-body ol ol,
.markdown-body ol ul {
  margin-top: 0;
  margin-bottom: 0;
}

.markdown-body li>p {
  margin-top: 16px;
}

.markdown-body dl {
  padding: 0;
}

.markdown-body dl dt {
  padding: 0;
  margin-top: 16px;
  font-size: 1em;
  font-style: italic;
  font-weight: bold;
}

.markdown-body dl dd {
  padding: 0 16px;
  margin-bottom: 16px;
}

.markdown-body blockquote {
  padding: 0 15px;
  color: #777;
  border-left: 4px solid #ddd;
}

.markdown-body blockquote>:first-child {
  margin-top: 0;
}

.markdown-body blockquote>:last-child {
  margin-bottom: 0;
}

.markdown-body table {
  display: block;
  width: 100%;
  overflow: auto;
  word-break: normal;
  word-break: keep-all;
}

.markdown-body table th {
  font-weight: bold;
}

.markdown-body table th,
.markdown-body table td {
  padding: 6px 13px;
  border: 1px solid #ddd;
}

.markdown-body table tr {
  background-color: #fff;
  border-top: 1px solid #ccc;
}

.markdown-body table tr:nth-child(2n) {
  background-color: #f8f8f8;
}

.markdown-body img {
  max-width: 100%;
  box-sizing: content-box;
  background-color: #fff;
}

.markdown-body code {
  padding: 0;
  padding-top: 0.2em;
  padding-bottom: 0.2em;
  margin: 0;
  font-size: 85%;
  background-color: rgba(0,0,0,0.04);
  border-radius: 3px;
}

.markdown-body code:before,
.markdown-body code:after {
  letter-spacing: -0.2em;
  content: "\00a0";
}

.markdown-body pre>code {
  padding: 0;
  margin: 0;
  font-size: 100%;
  word-break: normal;
  white-space: pre;
  background: transparent;
  border: 0;
}

.markdown-body .highlight {
  margin-bottom: 16px;
}

.markdown-body .highlight pre,
.markdown-body pre {
  padding: 16px;
  overflow: auto;
  font-size: 85%;
  line-height: 1.45;
  background-color: #f7f7f7;
  border-radius: 3px;
}

.markdown-body .highlight pre {
  margin-bottom: 0;
  word-break: normal;
}

.markdown-body pre {
  word-wrap: normal;
}

.markdown-body pre code {
  display: inline;
  max-width: initial;
  padding: 0;
  margin: 0;
  overflow: initial;
  line-height: inherit;
  word-wrap: normal;
  background-color: transparent;
  border: 0;
}

.markdown-body pre code:before,
.markdown-body pre code:after {
  content: normal;
}

.markdown-body kbd {
  display: inline-block;
  padding: 3px 5px;
  font-size: 11px;
  line-height: 10px;
  color: #555;
  vertical-align: middle;
  background-color: #fcfcfc;
  border: solid 1px #ccc;
  border-bottom-color: #bbb;
  border-radius: 3px;
  box-shadow: inset 0 -1px 0 #bbb;
}

.markdown-body .pl-c {
  color: #969896;
}

.markdown-body .pl-c1,
.markdown-body .pl-s .pl-v {
  color: #0086b3;
}

.markdown-body .pl-e,
.markdown-body .pl-en {
  color: #795da3;
}

.markdown-body .pl-s .pl-s1,
.markdown-body .pl-smi {
  color: #333;
}

.markdown-body .pl-ent {
  color: #63a35c;
}

.markdown-body .pl-k {
  color: #a71d5d;
}

.markdown-body .pl-pds,
.markdown-body .pl-s,
.markdown-body .pl-s .pl-pse .pl-s1,
.markdown-body .pl-sr,
.markdown-body .pl-sr .pl-cce,
.markdown-body .pl-sr .pl-sra,
.markdown-body .pl-sr .pl-sre {
  color: #183691;
}

.markdown-body .pl-v {
  color: #ed6a43;
}

.markdown-body .pl-id {
  color: #b52a1d;
}

.markdown-body .pl-ii {
  background-color: #b52a1d;
  color: #f8f8f8;
}

.markdown-body .pl-sr .pl-cce {
  color: #63a35c;
  font-weight: bold;
}

.markdown-body .pl-ml {
  color: #693a17;
}

.markdown-body .pl-mh,
.markdown-body .pl-mh .pl-en,
.markdown-body .pl-ms {
  color: #1d3e81;
  font-weight: bold;
}

.markdown-body .pl-mq {
  color: #008080;
}

.markdown-body .pl-mi {
  color: #333;
  font-style: italic;
}

.markdown-body .pl-mb {
  color: #333;
  font-weight: bold;
}

.markdown-body .pl-md {
  background-color: #ffecec;
  color: #bd2c00;
}

.markdown-body .pl-mi1 {
  background-color: #eaffea;
  color: #55a532;
}

.markdown-body .pl-mdr {
  color: #795da3;
  font-weight: bold;
}

.markdown-body .pl-mo {
  color: #1d3e81;
}

.markdown-body kbd {
  display: inline-block;
  padding: 3px 5px;
  font: 11px Consolas, "Liberation Mono", Menlo, Courier, monospace;
  line-height: 10px;
  color: #555;
  vertical-align: middle;
  background-color: #fcfcfc;
  border: solid 1px #ccc;
  border-bottom-color: #bbb;
  border-radius: 3px;
  box-shadow: inset 0 -1px 0 #bbb;
}

.markdown-body .plan-price-unit {
  color: #767676;
  font-weight: normal;
}

.markdown-body .task-list-item {
  list-style-type: none;
}

.markdown-body .task-list-item+.task-list-item {
  margin-top: 3px;
}

.markdown-body .task-list-item input {
  margin: 0 0.35em 0.25em -1.6em;
  vertical-align: middle;
}

.markdown-body .plan-choice {
  padding: 15px;
  padding-left: 40px;
  display: block;
  border: 1px solid #e0e0e0;
  position: relative;
  font-weight: normal;
  background-color: #fafafa;
}

.markdown-body .plan-choice.open {
  background-color: #fff;
}

.markdown-body .plan-choice.open .plan-choice-seat-breakdown {
  display: block;
}

.markdown-body .plan-choice-free {
  border-radius: 3px 3px 0 0;
}

.markdown-body .plan-choice-paid {
  border-radius: 0 0 3px 3px;
  border-top: 0;
  margin-bottom: 20px;
}

.markdown-body .plan-choice-radio {
  position: absolute;
  left: 15px;
  top: 18px;
}

.markdown-body .plan-choice-exp {
  color: #999;
  font-size: 12px;
  margin-top: 5px;
}

.markdown-body .plan-choice-seat-breakdown {
  margin-top: 10px;
  display: none;
}

.markdown-body :checked+.radio-label {
  z-index: 1;
  position: relative;
  border-color: #4078c0;
}

@media print {
  body .markdown-body {
    padding: 0;
    border: none;
  }
}
</style><title>java-interview-questions</title></head><body><article class="markdown-body"><h1>
<a id="user-content-java-interview-questions" class="anchor" href="#java-interview-questions" aria-hidden="true"><span aria-hidden="true" class="octicon octicon-link"></span></a>Java Interview Questions</h1>
<p>Do you have what it takes to ace a Java Interview? We are here to help you in consolidating your knowledge and concepts in Java. The following article will cover all the popular Java interview questions in depth.</p>
<p>Go through all the questions to enhance your chances of performing well in the interviews. The questions will revolve around the basic and core fundamentals of Java.</p>
<p>So, let’s dive deep into the plethora of useful interview questions on Java.</p>
<h2>
<a id="user-content-1-what-do-you-understand-by-an-instance-variable-and-a-local-variable" class="anchor" href="#1-what-do-you-understand-by-an-instance-variable-and-a-local-variable" aria-hidden="true"><span aria-hidden="true" class="octicon octicon-link"></span></a>1. What do you understand by an instance variable and a local variable?</h2>
<p><strong>Instance variables</strong> are those variables that are accessible by all the methods in the class. They are declared outside the methods and inside the class. These variables describe the properties of an object and remain bound to it at any cost.</p>
<p>All the objects of the class will have their copy of the variables for utilization. If any modification is done on these variables, then only that instance will be impacted by it, and all other class instances continue to remain unaffected.</p>
<div class="highlight highlight-source-java"><pre><span class="pl-k">class</span> <span class="pl-en">Athlete</span> {
	<span class="pl-k">public</span> <span class="pl-smi">String</span> athleteName;
	<span class="pl-k">public</span> <span class="pl-k">double</span> athleteSpeed;
	<span class="pl-k">public</span> <span class="pl-k">int</span> athleteAge;
}</pre></div>
<p><strong>Local variables</strong> are those variables present within a block, function, or a constructor and can be accessed only inside them. The utilization of the variable is restricted to the block scope. Whenever a local variable is declared inside a method, the other class methods don’t have any knowledge about the local variable.</p>
<div class="highlight highlight-source-java"><pre><span class="pl-k">public</span> <span class="pl-k">void</span> athlete() {
	<span class="pl-smi">String</span> athleteName;
	<span class="pl-k">double</span> athleteSpeed;
	<span class="pl-k">int</span> athleteAge;
}</pre></div>
<p><a href="images/img1.png" target="_blank" rel="noopener noreferrer"><img src="images/img1.png" alt="" style="max-width:100%;"></a></p>
<h2>
<a id="user-content-2-contiguous-memory-locations-are-usually-used-for-storing-actual-values-in-an-array-but-not-in-arraylist-explain" class="anchor" href="#2-contiguous-memory-locations-are-usually-used-for-storing-actual-values-in-an-array-but-not-in-arraylist-explain" aria-hidden="true"><span aria-hidden="true" class="octicon octicon-link"></span></a>2. Contiguous memory locations are usually used for storing actual values in an array but not in <code>ArrayList</code>. Explain.</h2>
<p>In the case of <code>ArrayList</code>, data storing in the form of primitive data types (like <code>int</code>, <code>float</code> etc.) is not possible. The data members/objects present in the ArrayList have references to the objects which are located at various sites in the memory. Thus, storing of actual objects or non-primitive data types (like <code>Integer</code>, <code>Double</code> etc.) takes place in various memory locations.</p>
<p><a href="images/img2.png" target="_blank" rel="noopener noreferrer"><img src="images/img2.png" alt="" style="max-width:100%;"></a></p>
<p>However, the same does not apply to the arrays. Object or primitive type values can be stored in arrays in contiguous memory locations, hence its every element does not require any reference to the next element.</p>
<p><a href="images/img3.png" target="_blank" rel="noopener noreferrer"><img src="images/img3.png" alt="" style="max-width:100%;"></a></p>
<h2>
<a id="user-content-3-pointers-are-used-in-c-c-why-does-java-not-make-use-of-pointers" class="anchor" href="#3-pointers-are-used-in-c-c-why-does-java-not-make-use-of-pointers" aria-hidden="true"><span aria-hidden="true" class="octicon octicon-link"></span></a>3. Pointers are used in C/ C++. Why does Java not make use of pointers?</h2>
<p>Pointers are quite complicated and unsafe to use by beginner programmers. Java focuses on code simplicity, and usage of pointers can make it challenging. Pointer utilization can also cause potential errors. Moreover, security is also compromised if pointers are used because the users can directly access memory with the help of pointers.</p>
<p>Thus, a certain level of abstraction is furnished by not including pointers in Java. Moreover, the usage of pointers can make the procedure of garbage collection quite slow and erroneous. Java makes use of references as these cannot be manipulated, unlike pointers.</p>
<h2>
<a id="user-content-4-apart-from-the-security-aspect-what-are-the-reasons-behind-making-strings-immutable-in-java" class="anchor" href="#4-apart-from-the-security-aspect-what-are-the-reasons-behind-making-strings-immutable-in-java" aria-hidden="true"><span aria-hidden="true" class="octicon octicon-link"></span></a>4. Apart from the security aspect, what are the reasons behind making strings immutable in Java?</h2>
<p>A String is made immutable due to the following reasons:</p>
<ul>
<li>
<strong>String Pool:</strong> Designers of Java were aware of the fact that String data type is going to be majorly used by the programmers and developers. Thus, they wanted optimization from the beginning. They came up with the notion of using the String pool (a storage area in Java heap) to store the String literals.
<a href="images/img4.png" target="_blank" rel="noopener noreferrer"><img src="images/img4.png" alt="" style="max-width:100%;"></a>
They intended to decrease the temporary String object with the help of sharing. Immutable class is needed to facilitate sharing. The sharing of the mutable structures between two unknown parties is not possible. Thus, immutable Java String helps in executing the concept of String Pool.</li>
<li>
<strong>Multithreading:</strong> Safety of threads regarding the String objects is an important aspect in Java. No external synchronization is required if the String objects are immutable. Thus, a cleaner code can be written for sharing the String objects across different threads. The complex process of concurrency is facilitated by this method.</li>
<li>
<strong>Collections:</strong> In case of Hashtables and HashMaps, keys are String objects. If the String objects are not immutable, then it can get modified during the period when it resides in the HashMaps. Consequently, the retrieval of the desired data is not possible. Such changing states pose a lot of risks. Therefore, it is quite safe to make the string immutable.</li>
</ul>
<h2>
<a id="user-content-5-although-inheritance-is-a-popular-oop-concept-it-is-less-advantageous-than-composition-explain" class="anchor" href="#5-although-inheritance-is-a-popular-oop-concept-it-is-less-advantageous-than-composition-explain" aria-hidden="true"><span aria-hidden="true" class="octicon octicon-link"></span></a>5. Although inheritance is a popular OOP concept, it is less advantageous than composition. Explain.</h2>
<p>Inheritance lags behind composition in the following scenarios:</p>
<ul>
<li>
<p><strong>Multiple-inheritance is not possible in Java</strong>
Classes can only extend from one superclass. In cases where multiple functionalities are required, for example - to read and write information into the file, the pattern of composition is preferred. The writer, as well as reader functionalities, can be made use of by considering them as the private members.</p>
</li>
<li>
<p><strong>Composition assists in attaining high flexibility and prevents breaking of encapsulation.</strong></p>
</li>
<li>
<p><strong>Unit testing is possible with composition and not inheritance.</strong>
When a developer wants to test a class composing a different class, then Mock Object can be created for signifying the composed class to facilitate testing.
This technique is not possible with the help of inheritance as the derived class cannot be tested without the help of the superclass in inheritance.</p>
</li>
<li>
<p><strong>The loosely coupled nature of composition is preferable over the tightly coupled nature of inheritance.</strong>
Let’s take an example:</p>
<div class="highlight highlight-source-java"><pre><span class="pl-k">package</span> <span class="pl-smi">comparison</span>;
    
 <span class="pl-k">public</span> <span class="pl-k">class</span> <span class="pl-en">Top</span> {
 	<span class="pl-k">public</span> <span class="pl-k">int</span> <span class="pl-en">start</span>() {
 		<span class="pl-k">return</span> <span class="pl-c1">0</span>;
 	}
 }

 <span class="pl-k">class</span> <span class="pl-en">Bottom</span> <span class="pl-k">extends</span> <span class="pl-e">Top</span> {
 	<span class="pl-k">public</span> <span class="pl-k">int</span> <span class="pl-en">stop</span>() {
 	<span class="pl-k">return</span> <span class="pl-c1">0</span>;
 	}
 }</pre></div>
<p>In the above example, inheritance is followed.
Now, some modifications are done to the Top class like this:</p>
<div class="highlight highlight-source-java"><pre> <span class="pl-k">public</span> <span class="pl-k">class</span> <span class="pl-en">Top</span> {
 	<span class="pl-k">public</span> <span class="pl-k">int</span> <span class="pl-en">start</span>() {
 		<span class="pl-k">return</span> <span class="pl-c1">0</span>;
 	}
 	<span class="pl-k">public</span> <span class="pl-k">void</span> <span class="pl-en">stop</span>() {
 	}
 }</pre></div>
<p>If the new implementation of the Top class is followed, a <strong>compile-time</strong> error is bound to occur in the Bottom class. Incompatible return type is there for the <code>Top.stop()</code> function. Changes have to be made to either the Top or the Bottom class to ensure compatibility.
However, the composition technique can be utilized to solve the given problem:</p>
<div class="highlight highlight-source-java"><pre> <span class="pl-k">class</span> <span class="pl-en">Bottom</span> {
 	<span class="pl-smi">Top</span> par <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Top</span>();
 	
 	<span class="pl-k">public</span> <span class="pl-k">int</span> <span class="pl-en">stop</span>() {
 		par<span class="pl-k">.</span>start();
 		par<span class="pl-k">.</span>stop();
 		<span class="pl-k">return</span> <span class="pl-c1">0</span>;
 	}
 }</pre></div>
</li>
</ul>
<h2>
<a id="user-content-6-briefly-explain-the-concept-of-constructor-overloading" class="anchor" href="#6-briefly-explain-the-concept-of-constructor-overloading" aria-hidden="true"><span aria-hidden="true" class="octicon octicon-link"></span></a>6. Briefly explain the concept of constructor overloading.</h2>
<p>Constructor overloading is the process of creating multiple constructors in the class consisting of the same name with a difference in the constructor parameters. Depending upon the number of parameters and their corresponding types, distinguishing of the different types of constructors is done by the compiler.</p>
<div class="highlight highlight-source-java"><pre><span class="pl-k">class</span> <span class="pl-en">Hospital</span> {
	<span class="pl-k">int</span> variable1, variable2;
	<span class="pl-k">double</span> variable3;
	
	<span class="pl-k">public</span> <span class="pl-en">Hospital</span>(<span class="pl-k">int</span> <span class="pl-v">doctors</span>, <span class="pl-k">int</span> <span class="pl-v">nurses</span>) {
		variable1 <span class="pl-k">=</span> doctors;
		variable2 <span class="pl-k">=</span> nurses;
	}
	
	<span class="pl-k">public</span> <span class="pl-en">Hospital</span>(<span class="pl-k">int</span> <span class="pl-v">doctors</span>) {
		variable1 <span class="pl-k">=</span> doctors;
	}
	
	<span class="pl-k">public</span> <span class="pl-en">Hospital</span>(<span class="pl-k">double</span> <span class="pl-v">salaries</span>) {
		variable3 <span class="pl-k">=</span> salaries
	}
}</pre></div>
<p>Three constructors are defined here but they differ on the basis of parameters type and their numbers.</p>
<h2>
<a id="user-content-7-comment-on-method-overloading-and-overriding-by-citing-relevant-examples" class="anchor" href="#7-comment-on-method-overloading-and-overriding-by-citing-relevant-examples" aria-hidden="true"><span aria-hidden="true" class="octicon octicon-link"></span></a>7. Comment on method overloading and overriding by citing relevant examples.</h2>
<p>In Java, <strong>method overloading</strong> is made possible by introducing different methods in the same class consisting of the same name. Still, all the functions differ in the number or type of parameters. It takes place inside a class and enhances program readability.</p>
<p>Only difference in the return type of the method does not promote method overloading. The following example will furnish you with a clear picture of it.
<a href="images/img5.png" target="_blank" rel="noopener noreferrer"><img src="images/img5.png" alt="" style="max-width:100%;"></a>
Both the functions have the same name but differ in the number of arguments. The first method calculates the area of the rectangle, whereas the second method calculates the area of a cuboid.</p>
<p><strong>Method overriding</strong> is the concept in which two methods having the same method signature are present in two different classes in which an inheritance relationship is present. A particular method implementation (already present in the base class) is possible for the derived class by using method overriding.
Let’s give a look at this example:
<a href="images/img6.png" target="_blank" rel="noopener noreferrer"><img src="images/img6.png" alt="" style="max-width:100%;"></a>
Both class methods have the name walk and the same parameters, distance and time. If the derived class method is called, then the base class method walk gets overridden by that of the derived class.</p>
<p>Note that the <code>@Override</code> annotation is optional, but is considered a good coding practice.</p>
<h2>
<a id="user-content-8-how-would-you-differentiate-between-a-string-stringbuffer-and-a-stringbuilder" class="anchor" href="#8-how-would-you-differentiate-between-a-string-stringbuffer-and-a-stringbuilder" aria-hidden="true"><span aria-hidden="true" class="octicon octicon-link"></span></a>8. How would you differentiate between a String, StringBuffer, and a StringBuilder?</h2>
<ol>
<li>
<strong>Storage area:</strong> In string, the String pool serves as the storage area. For StringBuilder and StringBuffer, heap memory is the storage area.</li>
<li>
<strong>Mutability:</strong> A String is immutable, whereas both the StringBuilder and StringBuffer are mutable.</li>
<li>
<strong>Efficiency:</strong> It is quite slow to work with a String. However, StringBuilder is the fastest in performing operations. The speed of a StringBuffer is more than a String and less than a StringBuilder. (For example appending a character is fastest in StringBuilder and very slow in String because a new memory is required for the new String with appended character.)</li>
<li>
<strong>Thread-safe:</strong>  In the case of a threaded environment, StringBuilder and StringBuffer are used whereas a String is not used. However, StringBuilder is suitable for an environment with a single thread, and a StringBuffer is suitable for multiple threads.</li>
</ol>
<p><strong>Syntax:</strong></p>
<div class="highlight highlight-source-java"><pre><span class="pl-c"><span class="pl-c">//</span> String</span>
<span class="pl-smi">String</span> first <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">"</span>InterviewBit<span class="pl-pds">"</span></span>;
<span class="pl-smi">String</span> second <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">String</span>(<span class="pl-s"><span class="pl-pds">"</span>InterviewBit<span class="pl-pds">"</span></span>);
<span class="pl-c"><span class="pl-c">//</span> StringBuffer</span>
<span class="pl-smi">StringBuffer</span> third <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">StringBuffer</span>(<span class="pl-s"><span class="pl-pds">"</span>InterviewBit<span class="pl-pds">"</span></span>);
<span class="pl-c"><span class="pl-c">//</span> StringBuilder</span>
<span class="pl-smi">StringBuilder</span> fourth <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">StringBuilder</span>(<span class="pl-s"><span class="pl-pds">"</span>InterviewBit<span class="pl-pds">"</span></span>);</pre></div>
<h2>
<a id="user-content-9-using-relevant-properties-highlight-the-differences-between-interfaces-and-abstract-classes" class="anchor" href="#9-using-relevant-properties-highlight-the-differences-between-interfaces-and-abstract-classes" aria-hidden="true"><span aria-hidden="true" class="octicon octicon-link"></span></a>9. Using relevant properties highlight the differences between interfaces and abstract classes.</h2>
<ol>
<li>
<strong>Availability of methods:</strong> Only abstract methods are available in interfaces, whereas non-abstract methods can be present along with abstract methods in abstract classes.</li>
<li>
<strong>Variable types:</strong> Static and final variables can only be declared in case of interfaces, whereas abstract classes can also have non-static and non-final variables.</li>
<li>
<strong>Inheritance:</strong> Multiple inheritance is facilitated by interfaces, whereas abstract classes do not promote multiple inheritances.</li>
<li>
<strong>Data member accessibility:</strong> By default, the class data members of interfaces are of the public- type. Conversely, the class members for an abstract class can be protected or private also.</li>
<li>
<strong>Implementation:</strong> With the help of an abstract class, the implementation of an interface is easily possible.
However, the converse is not true;
Abstract class:
<div class="highlight highlight-source-java"><pre><span class="pl-k">public</span> <span class="pl-k">abstract</span> <span class="pl-k">class</span> <span class="pl-en">Athlete</span> {
	<span class="pl-k">public</span> <span class="pl-k">abstract</span> <span class="pl-k">void</span> <span class="pl-en">walk</span>();
}</pre></div>
Interface:
<div class="highlight highlight-source-java"><pre><span class="pl-k">public</span> <span class="pl-k">interface</span> <span class="pl-en">Walkable</span> {
	<span class="pl-k">void</span> <span class="pl-en">walk</span>();
}</pre></div>
</li>
</ol>
<h2>
<a id="user-content-10-how-is-the-creation-of-a-string-using-new-different-from-that-of-a-literal" class="anchor" href="#10-how-is-the-creation-of-a-string-using-new-different-from-that-of-a-literal" aria-hidden="true"><span aria-hidden="true" class="octicon octicon-link"></span></a>10. How is the creation of a String using <code>new()</code> different from that of a literal?</h2>
<p>When a String is formed as a literal with the assistance of an assignment operator, it makes its way into the String constant pool so that <a href="https://en.wikipedia.org/wiki/String_interning" rel="nofollow">String Interning</a> can take place. This same object in the heap will be referenced by a different String if the content is the same for both of them.</p>
<div class="highlight highlight-source-java"><pre><span class="pl-k">public</span> bool checking() {
	<span class="pl-smi">String</span> first <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">"</span>InterviewBit<span class="pl-pds">"</span></span>;
	<span class="pl-smi">String</span> second <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">"</span>InterviewBit<span class="pl-pds">"</span></span>;
	<span class="pl-k">if</span> (first <span class="pl-k">==</span> second)
		<span class="pl-k">return</span> <span class="pl-c1">true</span>;
	<span class="pl-k">else</span>
		<span class="pl-k">return</span> <span class="pl-c1">false</span>;
}</pre></div>
<p>The <code>checking()</code> function will return true as the same content is referenced by both the variables.
<a href="images/img7.png" target="_blank" rel="noopener noreferrer"><img src="images/img7.png" alt="" style="max-width:100%;"></a>
Conversely, when a String formation takes place by the help of a <code>new()</code> operator, interning does not take place. The object gets created in the heap memory even if the same content object is present.</p>
<div class="highlight highlight-source-java"><pre><span class="pl-k">public</span> bool checking() {
	<span class="pl-smi">String</span> first <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">String</span>(<span class="pl-s"><span class="pl-pds">"</span>InterviewBit<span class="pl-pds">"</span></span>);
	<span class="pl-smi">String</span> second <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">String</span>(<span class="pl-s"><span class="pl-pds">"</span>InterviewBit<span class="pl-pds">"</span></span>);
	<span class="pl-k">if</span> (first <span class="pl-k">==</span> second)
		<span class="pl-k">return</span> <span class="pl-c1">true</span>;
	<span class="pl-k">else</span>
		<span class="pl-k">return</span> <span class="pl-c1">false</span>;
}</pre></div>
<p><a href="images/img8.png" target="_blank" rel="noopener noreferrer"><img src="images/img8.png" alt="" style="max-width:100%;"></a>
The <code>checking()</code> function will return false as the same content is not referenced by both the variables.</p>
<h2>
<a id="user-content-11-in-java-static-as-well-as-private-method-overriding-is-possible-comment-on-the-statement" class="anchor" href="#11-in-java-static-as-well-as-private-method-overriding-is-possible-comment-on-the-statement" aria-hidden="true"><span aria-hidden="true" class="octicon octicon-link"></span></a>11. In Java, static as well as private method overriding is possible. Comment on the statement.</h2>
<p>The statement in the context is completely False. The static methods have no relevance with the objects, and these methods are of the class level. In the case of a child class, a static method with a method signature exactly like that of the parent class can exist without even throwing any compilation error.</p>
<p>The phenomenon mentioned here is popularly known as method hiding, and overriding is certainly not possible. Private method overriding is unimaginable because the visibility of the private method is restricted to the parent class only. As a result, only hiding can be facilitated and not overriding.</p>
<h2>
<a id="user-content-12-a-single-try-block-and-multiple-catch-blocks-can-co-exist-in-a-java-program-explain" class="anchor" href="#12-a-single-try-block-and-multiple-catch-blocks-can-co-exist-in-a-java-program-explain" aria-hidden="true"><span aria-hidden="true" class="octicon octicon-link"></span></a>12. A single <code>try</code> block and multiple <code>catch</code> blocks can co-exist in a Java Program. Explain.</h2>
<p>Yes, multiple catch blocks can exist but specific approaches should come prior to the general approach because only the first catch block satisfying the catch condition is executed.
The given code illustrates the same:</p>
<div class="highlight highlight-source-java"><pre><span class="pl-k">public</span> <span class="pl-k">class</span> <span class="pl-en">MultipleCatch</span> {
	<span class="pl-k">public</span> <span class="pl-k">static</span> <span class="pl-k">void</span> <span class="pl-en">main</span>(<span class="pl-smi">String</span> <span class="pl-v">args</span>[]) {
		<span class="pl-k">try</span> {
			<span class="pl-k">int</span> n <span class="pl-k">=</span> <span class="pl-c1">1000</span>, x <span class="pl-k">=</span> <span class="pl-c1">0</span>;
			<span class="pl-k">int</span> arr[] <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">int</span>[n];
			<span class="pl-k">for</span> (<span class="pl-k">int</span> i <span class="pl-k">=</span> <span class="pl-c1">0</span>; i <span class="pl-k">&lt;=</span> n; i<span class="pl-k">++</span>) {
				arr[i] <span class="pl-k">=</span> i <span class="pl-k">/</span> x;
			}
		} <span class="pl-k">catch</span> (<span class="pl-smi">ArrayIndexOutOfBoundsException</span> exception) {
			<span class="pl-smi">System</span><span class="pl-k">.</span>out<span class="pl-k">.</span>println(<span class="pl-s"><span class="pl-pds">"</span>1st block = ArrayIndexOutOfBoundsException<span class="pl-pds">"</span></span>);
		} <span class="pl-k">catch</span> (<span class="pl-smi">ArithmeticException</span> exception) {
			<span class="pl-smi">System</span><span class="pl-k">.</span>out<span class="pl-k">.</span>println(<span class="pl-s"><span class="pl-pds">"</span>2nd block = ArithmeticException<span class="pl-pds">"</span></span>);
		} <span class="pl-k">catch</span> (<span class="pl-smi">Exception</span> exception) {
			<span class="pl-smi">System</span><span class="pl-k">.</span>out<span class="pl-k">.</span>println(<span class="pl-s"><span class="pl-pds">"</span>3rd block = Exception<span class="pl-pds">"</span></span>);
		}
	}
}</pre></div>
<p>Here, the second catch block will be executed because of division by <code>0</code> (<code>i / x</code>). Incase <code>x</code> was greater than <code>0</code> then the first catch block will execute because for loop runs till <code>i = n</code> and array index are till <code>n-1</code>.</p>
<h2>
<a id="user-content-13-do-final-finally-and-finalize-keywords-have-the-same-function" class="anchor" href="#13-do-final-finally-and-finalize-keywords-have-the-same-function" aria-hidden="true"><span aria-hidden="true" class="octicon octicon-link"></span></a>13. Do <code>final</code>, <code>finally</code> and <code>finalize</code> keywords have the same function?</h2>
<p>All three keywords have their own utility while programming.</p>
<p><strong>Final</strong>
If any restriction is required for classes, variables, or methods, the final keyword comes in handy. Inheritance of a final class and overriding of a final method is restricted by the use of the final keyword. The variable value becomes fixed after incorporating the final keyword.
Example:</p>
<div class="highlight highlight-source-java"><pre>	<span class="pl-k">final</span> <span class="pl-k">int</span> a<span class="pl-k">=</span><span class="pl-c1">100</span>;
	a <span class="pl-k">=</span> <span class="pl-c1">0</span>;  <span class="pl-c"><span class="pl-c">//</span> error</span></pre></div>
<p>The second statement will throw an error.</p>
<p><strong>Finally</strong>
It is the block present in a program where all the codes written inside it get executed irrespective of handling of exceptions.
Example:</p>
<div class="highlight highlight-source-java"><pre><span class="pl-k">try</span> {
	<span class="pl-k">int</span> variable <span class="pl-k">=</span> <span class="pl-c1">5</span>;
} <span class="pl-k">catch</span> (<span class="pl-smi">Exception</span> exception) {
	<span class="pl-smi">System</span><span class="pl-k">.</span>out<span class="pl-k">.</span>println(<span class="pl-s"><span class="pl-pds">"</span>Exception occurred<span class="pl-pds">"</span></span>);
} <span class="pl-k">finally</span> {
	<span class="pl-smi">System</span><span class="pl-k">.</span>out<span class="pl-k">.</span>println(<span class="pl-s"><span class="pl-pds">"</span>Execution of finally block<span class="pl-pds">"</span></span>);
}</pre></div>
<p><strong>Finalize</strong>
Prior to the garbage collection of an object, the finalize method is called so that the clean-up activity is implemented.
Example:</p>
<div class="highlight highlight-source-java"><pre><span class="pl-k">public</span> <span class="pl-k">static</span> <span class="pl-k">void</span> main(<span class="pl-k">String</span>[] args) {
	<span class="pl-smi">String</span> example <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">String</span>(<span class="pl-s"><span class="pl-pds">"</span>InterviewBit<span class="pl-pds">"</span></span>);
	example <span class="pl-k">=</span> <span class="pl-c1">null</span>;
	<span class="pl-smi">System</span><span class="pl-k">.</span>gc(); <span class="pl-c"><span class="pl-c">//</span> Garbage collector called</span>
}
<span class="pl-k">public</span> <span class="pl-k">void</span> finalize() {
	<span class="pl-c"><span class="pl-c">//</span> Finalize called</span>
}</pre></div>
<h2>
<a id="user-content-14-is-exceeding-the-memory-limit-possible-in-a-program-despite-having-a-garbage-collector" class="anchor" href="#14-is-exceeding-the-memory-limit-possible-in-a-program-despite-having-a-garbage-collector" aria-hidden="true"><span aria-hidden="true" class="octicon octicon-link"></span></a>14. Is exceeding the memory limit possible in a program despite having a garbage collector?</h2>
<p>Yes, it is possible for the program to go out of memory in spite of the presence of a garbage collector. Garbage collection assists in recognizing and eliminating those objects which are not required in the program anymore, in order to free up the resources used by them.</p>
<p>In a program, if an object is unreachable, then the execution of garbage collection takes place with respect to that object. If the amount of memory required for creating a new object is not sufficient, then memory is released for those objects which are no longer in the scope with the help of a garbage collector. The memory limit is exceeded for the program when the memory released is not enough for creating new objects.</p>
<p>Moreover, exhaustion of the heap memory takes place if objects are created in such a manner that they remain in the scope and consume memory. The developer should make sure to dereference the object after its work is accomplished. Although the garbage collector endeavours its level best to reclaim memory as much as possible, memory limits can still be exceeded.</p>
<p>Let’s take a look at the following example:</p>
<div class="highlight highlight-source-java"><pre><span class="pl-k">List&lt;<span class="pl-smi">String</span>&gt;</span> example <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-k">LinkedList&lt;<span class="pl-smi">String</span>&gt;</span>();
<span class="pl-k">while</span>(<span class="pl-c1">true</span>){
	example<span class="pl-k">.</span>add(<span class="pl-k">new</span> <span class="pl-smi">String</span>(<span class="pl-s"><span class="pl-pds">"</span>Memory Limit Exceeded<span class="pl-pds">"</span></span>));
}</pre></div>
<h2>
<a id="user-content-15-what-makes-a-hashset-different-from-a-treeset" class="anchor" href="#15-what-makes-a-hashset-different-from-a-treeset" aria-hidden="true"><span aria-hidden="true" class="octicon octicon-link"></span></a>15. What makes a <code>HashSet</code> different from a <code>TreeSet</code>?</h2>
<p>Although both HashSet and TreeSet are not synchronized and ensure that duplicates are not present, there are certain properties that distinguish a HashSet from a TreeSet.</p>
<ol>
<li>
<strong>Implementation:</strong> For a HashSet, the hash table is utilized for storing the elements in an unordered manner. However, TreeSet makes use of the red-black tree to store the elements in a sorted manner.</li>
<li>
<strong>Complexity/ Performance:</strong> For adding, retrieving, and deleting elements, the time amortized complexity is $\mathcal O(1)$ for a HashSet. The time complexity for performing the same operations is a bit higher for TreeSet and is equal to $\mathcal O(\log n)$. Overall, the performance of HashSet is faster in comparison to TreeSet.</li>
<li>
<strong>Methods:</strong> <code>hashCode()</code> and <code>equals()</code> are the methods utilized by HashSet for making comparisons between the objects. Conversely, <code>compareTo()</code> and <code>compare()</code> methods are utilized by TreeSet to facilitate object comparisons.</li>
<li>
<strong>Objects type:</strong> Heterogeneous and null objects can be stored with the help of HashSet. In the case of a TreeSet, runtime exception occurs while inserting heterogeneous objects or null objects.</li>
</ol>
<h2>
<a id="user-content-16-why-is-the-character-array-preferred-over-string-for-storing-confidential-information" class="anchor" href="#16-why-is-the-character-array-preferred-over-string-for-storing-confidential-information" aria-hidden="true"><span aria-hidden="true" class="octicon octicon-link"></span></a>16. Why is the character array preferred over string for storing confidential information?</h2>
<p>In Java, a string is basically immutable i.e. it cannot be modified. After its declaration, it continues to stay in the string pool as long as it is not removed in the form of garbage. In other words, a string resides in the heap section of the memory for an unregulated and unspecified time interval after string value processing is executed.</p>
<p>As a result, vital information can be stolen for pursuing harmful activities by hackers if a memory dump is illegally accessed by them. Such risks can be eliminated by using mutable objects or structures like character arrays for storing any variable. After the work of the character array variable is done, the variable can be configured to blank at the same instant. Consequently, it helps in saving heap memory and also gives no chance to the hackers to extract vital data.</p>
<h2>
<a id="user-content-17-why-is-synchronization-necessary-explain-with-the-help-of-a-relevant-example" class="anchor" href="#17-why-is-synchronization-necessary-explain-with-the-help-of-a-relevant-example" aria-hidden="true"><span aria-hidden="true" class="octicon octicon-link"></span></a>17. Why is synchronization necessary? Explain with the help of a relevant example.</h2>
<p>Concurrent execution of different processes is made possible by synchronization. When a particular resource is shared between many threads, situations may arise in which multiple threads require the same shared resource.</p>
<p>Synchronization assists in resolving the issue and the resource is shared by a single thread at a time. Let’s take an example to understand it more clearly. For example, you have a URL and you have to find out the number of requests made to it. Two simultaneous requests can make the count erratic.</p>
<p><a href="images/img9.png" target="_blank" rel="noopener noreferrer"><img src="images/img9.png" alt="" style="max-width:100%;"></a></p>
<p>If a thread Thread1 views the count as <code>10</code>, it will be increased by <code>1</code> to <code>11</code>. Simultaneously, if another thread Thread2 views the count as <code>10</code>, it will be increased by <code>1</code> to <code>11</code>. Thus, inconsistency in count values takes place because expected final value is <code>12</code> but actual final value we get will be <code>11</code>.</p>
<p>Now, the function <code>increase()</code> is made synchronized so that simultaneous accessing cannot take place.</p>
<p><a href="images/img10.png" target="_blank" rel="noopener noreferrer"><img src="images/img10.png" alt="" style="max-width:100%;"></a></p>
<p>If a thread Thread1 views the count as <code>10</code>, it will be increased by <code>1</code> to <code>11</code>, then the thread Thread2 will view the count as <code>11</code>, it will be increased by <code>1</code> to <code>12</code>. Thus, consistency in count values takes place.</p>
</article></body></html>
