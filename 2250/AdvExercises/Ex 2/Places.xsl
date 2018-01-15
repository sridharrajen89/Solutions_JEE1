<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
<head><title>Places</title>
</head>
<body border="3" cellspacing="1" cellpadding="5">
<table width="100%" border="1">
  <THEAD>
           <TR bgcolor='blue'>
                <TD width="35%"><B>Place</B></TD>
                <TD width="15%"><B>Type</B></TD>
                <TD width="10%"><B>name</B></TD>
                <TD width="10%"><B>facility</B></TD>
                <TD width="10%"><B>temp</B></TD>
          </TR>
   </THEAD> 
  <TBODY>
             <xsl:for-each select="places/place">
             <TR> 
             
                  <TD> width="35%"><xsl:value-of select="@state" /></TD>   
                  <TD width="15%"><xsl:value-of select="type" /></TD> 
                  <TD width="10%"><xsl:value-of select="name" /></TD>
				  <TD width="15%"><xsl:apply-templates select="facility" /></TD> 
                  <TD width="15%"><xsl:apply-templates select="temp" /></TD> 
            </TR>
            </xsl:for-each>
  </TBODY>
</table>
</body>
</html>
</xsl:template>
<xsl:template match="facility">
<table width="100%" border="1">
  <THEAD>
           <TR bgcolor='yellow'>
                <TD width="35%"><B>Boarding</B></TD>
                <TD width="15%"><B>Lodging</B></TD>
          </TR>
   </THEAD> 
   <TBODY>

             <TR> 
                  <TD width="35%"><xsl:value-of select="boarding" /></TD>   
                  <TD width="35%"><xsl:value-of select="lodging" /></TD>
			</TR>
</TBODY>
 </table>
</xsl:template>
<xsl:template match="temp">
<table width="100%" border="1">
  <THEAD>
           <TR  bgcolor='yellow'>
                <TD width="35%"><B>min</B></TD>
                <TD width="15%"><B>max</B></TD>
          </TR>
   </THEAD> 
   <TBODY>

             <TR> 
                  <TD width="35%"><xsl:value-of select="min" /></TD>   
                  <TD width="35%"><xsl:value-of select="max" /></TD>
			</TR>
</TBODY>
 </table>
</xsl:template>
</xsl:stylesheet>