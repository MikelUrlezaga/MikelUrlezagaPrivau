<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

<xsl:output method="xml" indent="yes"/>

<xsl:template match="/">
  <liburuak>
  <xsl:apply-templates/>
  </liburuak>
</xsl:template>

<xsl:template match="liburua">
  <liburua argitaratzea="{argitaratzea/@urtea}">
    <egilea>
      <izena><xsl:apply-templates select="egilea"/></izena>
      <jaiotza><xsl:value-of select="egilea/@jaiotzeData"/></jaiotza>
    </egilea>
    <izena><xsl:apply-templates select="izenburua"/></izena>
  </liburua>
</xsl:template>

</xsl:stylesheet>