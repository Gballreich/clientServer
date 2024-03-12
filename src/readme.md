a simple client/server program that lets a user 
connect to a server and send simple calculations to
the server. the server will then send back the 
answer to the calculation.
<table>
<th>client request</th>
<th>server request</th>
<th>description</th>
<tr>
<td>x + y EX:command="x+y"</td>
<td>EX x + y = result. return result</td>
<td>will output the addition of X and Y</td>
</tr>

<tr>
<td>x - y EX:command="x-y"</td>
<td>EX x-y=result. return result</td>
<td>will output the subtraction of X and Y</td>
</tr>

<tr>
<td>x * y EX:command="x*y"</td>
<td>EX x*y=result. return result</td>
<td>will output the multiplication of X and Y</td>
</tr>

<tr>
<td>x / y EX:command="x/y"</td>
<td>EX x/y=result. return result</td>
<td>will output the division of X and Y</td>
</tr>

<tr>
<td>$end EX:command $end</td>
<td>$end</td>
<td>will end the connection to the server</td>
</tr>
</table>