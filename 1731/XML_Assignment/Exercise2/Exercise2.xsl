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
        	<td bgcolor='white'>Id</td>
        	<td bgcolor='white'>Place-Name</td>
        	<td bgcolor='white'>State</td>
        	<td bgcolor='white'>Type</td>
        	<td bgcolor='Green'>Boarding facility</td>
        	<td bgcolor='Green'>Lodging facility</td>
        	<td bgcolor='Yellow'>Max temp</td>
        	<td bgcolor='Yellow'>Min temp</td>
        </tr>
         <xsl:apply-templates  select="//place" />
         
     </table>
    </center>
   </body>
  </html>
</xsl:template>

<xsl:template match="place">
  <tr>
    <td bgcolor=''>
      <xsl:value-of  select="@id" />
    </td>
    <td bgcolor=''>
      <xsl:value-of  select="name" />
    </td>
    <td bgcolor=''>
      <xsl:value-of  select="@state" />
    </td>
    <td bgcolor=''>
      <xsl:value-of  select="type" />
    </td>
    <xsl:for-each select="facility">
    	<td bgcolor=''>
      		<xsl:value-of  select="boarding" />
      	</td>
     	<td bgcolor=''>
       	<xsl:value-of  select="lodging" />
     	</td>
    </xsl:for-each>
	<td bgcolor='Red'>
     	<xsl:value-of  select="temp/max" />
    </td>
    <td bgcolor='Red'>
     	<xsl:value-of  select="temp/min" />
   </td>    
 </tr>   
</xsl:template> 

</xsl:stylesheet> 
