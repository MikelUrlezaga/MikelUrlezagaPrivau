<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

  <xsl:template match="/">
    <liburuak>
      <xsl:apply-templates/>
    </liburuak>
  </xsl:template>
  
  <xsl:template match="liburua">
    <!--<liburua argitaratzea="<xsl:value-of select="argitaratzea/@urtea" />">-->
    <liburua argitaratzea="{argitaratzea/@urtea}">
      <egilea>
        <!--<izena><xsl:value-of select="egilea" /></izena>
        <jaiotza><xsl:value-of select="egilea/@jaiotzeData" /></jaiotza>-->
        <xsl:apply-templates select="egilea"/>
      </egilea>
      <izena><xsl:value-of select="izenburua" /></izena>
    </liburua>
  </xsl:template>
  
   <xsl:template match="egilea">
    <izena><xsl:value-of select="." /></izena>
    <jaiotza><xsl:value-of select="@jaiotzeData" /></jaiotza>
   </xsl:template>
  
</xsl:stylesheet>
