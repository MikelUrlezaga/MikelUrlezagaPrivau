<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    
    <xsl:import href="../orokorra.xsl"/>
    
    <xsl:template match="/">
        <xsl:apply-imports />
    </xsl:template>
    
    <xsl:template match="bulegariak">
        <table>
            <tr>
                <th></th>
                <th></th>
                <th>Izena</th>
                <th>Abizena</th>
                <th>Nagusia</th>
            </tr>
            <xsl:apply-templates select="bulegaria"/>
        </table>
    </xsl:template>
    
    <xsl:template match="bulegaria">
        
        <xsl:variable name="nagusia" select="id_nagusi"/>
        
        <tr id="{@id}">
            <xsl:attribute name="class">
                <xsl:choose>
                    <xsl:when test="position() = 1">first</xsl:when>
                    <xsl:when test="position() mod 2 = 0">even</xsl:when>
                    <xsl:otherwise>odd</xsl:otherwise>
                </xsl:choose>
            </xsl:attribute>
            
            <td><xsl:value-of select="@id" /></td>
            <td>
                <!--<img src="../images/thumbnails/{abatar}" alt="{abatar}"/>-->
                <img>
                    <xsl:attribute name="src">
                        ../images/thumbnails/<xsl:value-of select="abatar"/>
                    </xsl:attribute>
                    <xsl:attribute name="alt">
                        <xsl:value-of select="abatar"/>
                    </xsl:attribute>                    
                </img>
            </td>
            <td><xsl:value-of select="izena" /></td>
            <td><xsl:value-of select="abizena" /></td>
            <td>
                <xsl:if test="id_nagusi/text()">
                    <!--<a href="#{id_nagusi}"><xsl:value-of select="id_nagusi" /></a>-->
                    <a href="#{id_nagusi}"><xsl:value-of select="//bulegaria[@id = $nagusia]/izena" /></a>
                </xsl:if>
            </td>
        </tr>
    </xsl:template>
    
</xsl:stylesheet>
