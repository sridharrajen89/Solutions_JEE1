<xsl:stylesheet 
      xmlns:xsl="http://www.w3.org/1999/XSL/Transform"      
      version="1.0"  >
<xsl:template match="/">
  <html>
   <head><title>Tourist Places</title></head>
   <body>
    <center>
     <table  border="4" cellspacing="2" cellpadding="6">
        <tr> 
        	<td bgcolor='green'>Tour Id</td>
        	<td bgcolor='green'>Tour Place</td>
        	<td bgcolor='green'>State</td>
        	<td bgcolor='green'>Tour Type</td>
        	<td bgcolor='green'>Boarding</td>
        	<td bgcolor='green'>Lodging</td>
        	<td bgcolor='green'>Max Temp</td>
        	<td bgcolor='green'>Min Temp</td>
        </tr>
         <xsl:apply-templates  select="//place" />
         
     </table>
    </center>
   </body>
  </html>
</xsl:template>

<xsl:template match="place">
  <tr>
    <td bgcolor='yellow'>
      <xsl:value-of  select="@id" />
    </td>
    <td bgcolor='yellow'>
      <xsl:value-of  select="name" />
    </td>
    <td bgcolor='yellow'>
      <xsl:value-of  select="@state" />
    </td>
    <td bgcolor='yellow'>
      <xsl:value-of  select="type" />
    </td>
    <xsl:for-each select="facility">
    	<td bgcolor='yellow'>
      		<xsl:value-of  select="boarding" />
      	</td>
     	<td bgcolor='yellow'>
       	<xsl:value-of  select="lodging" />
     	</td>
    </xsl:for-each>
	<td bgcolor='yellow'>
     	<xsl:value-of  select="temp/max" />
    </td>
    <td bgcolor='yellow'>
     	<xsl:value-of  select="temp/min" />
   </td>    
 </tr>   
</xsl:template> 

</xsl:stylesheet> 