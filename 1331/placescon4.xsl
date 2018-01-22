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
        	<td bgcolor='yellow'>Place-Id</td>
            <td bgcolor='yellow'>Place-state</td>
            <td bgcolor='yellow'>Place-type</td>
            <td bgcolor='yellow'>Place-name</td>
            <td bgcolor='yellow'>Place-NOP</td>
            <td bgcolor='yellow'>Place-boarding Facility</td>
            <td bgcolor='yellow'>Place-lodging Facility</td>
            <td bgcolor='yellow'>Place-Max Temp</td>
            <td bgcolor='yellow'>Place-Min Temp</td>
        </tr>
         <xsl:apply-templates  select="//place" />
       </table>
    </center>
   </body>
  </html>
</xsl:template>

<xsl:template match="//place">

  	
  <tr>
    <td bgcolor='cyan'>  <xsl:value-of  select="@id" />        </td>
    <td bgcolor='cyan'>  <xsl:value-of  select="@state" /></td>
    <td bgcolor='cyan'>  <xsl:value-of  select="type" /></td>
    <td bgcolor='cyan'>  <xsl:value-of  select="name" /></td>
    <td bgcolor='cyan'>  <xsl:value-of  select="NOP" /></td>
    <td bgcolor='cyan'>  <xsl:value-of  select="facility/boarding" /></td>
    <td bgcolor='cyan'>  <xsl:value-of  select="facility/lodging" /></td>
    <td bgcolor='cyan'>  <xsl:value-of  select="temp/max" /></td>
    <td bgcolor='cyan'>  <xsl:value-of  select="temp/min" /> </td> 
 </tr>
    
</xsl:template> 

</xsl:stylesheet> 
  