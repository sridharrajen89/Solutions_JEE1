<xsl:stylesheet 
      xmlns:xsl="http://www.w3.org/1999/XSL/Transform"      
      version="1.0"  >
<xsl:template match="/">
  <html>
   <head><title>Places in  Table</title></head>
   <body>
    <center>
     <table  border="3" cellspacing="1" cellpadding="5">
        <tr> 
        	<td bgcolor='blue'>Id</td>
        	<td bgcolor='blue'>Place-Name</td>
        	<td bgcolor='blue'>State</td>
        	<td bgcolor='blue'>Type</td>
        	<td bgcolor='blue'>Boarding facility</td>
        	<td bgcolor='blue'>Lodging facility</td>
        	<td bgcolor='blue'>Max temp</td>
        	<td bgcolor='blue'>Min temp</td>
        </tr>
         <xsl:apply-templates  select="//place" />
         
     </table>
    </center>
   </body>
  </html>
</xsl:template>

<xsl:template match="place">
  <tr>
    <td bgcolor='pink'>
      <xsl:value-of  select="@id" />
    </td>
    <td bgcolor='pink'>
      <xsl:value-of  select="name" />
    </td>
    <td bgcolor='pink'>
      <xsl:value-of  select="@state" />
    </td>
    <td bgcolor='pink'>
      <xsl:value-of  select="type" />
    </td>
    <xsl:for-each select="facility">
    	<td bgcolor='pink'>
      		<xsl:value-of  select="boarding" />
      	</td>
     	<td bgcolor='pink'>
       	<xsl:value-of  select="lodging" />
     	</td>
    </xsl:for-each>
	<td bgcolor='pink'>
     	<xsl:value-of  select="temp/max" />
    </td>
    <td bgcolor='pink'>
     	<xsl:value-of  select="temp/min" />
   </td>    
 </tr>   
</xsl:template> 

</xsl:stylesheet> 