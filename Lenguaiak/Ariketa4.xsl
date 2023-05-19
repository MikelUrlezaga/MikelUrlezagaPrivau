<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:param name="title" select="'Baratza'"/>
  <xsl:template match="/">
    <html>
      <head>
        <title>
          <xsl:value-of select="$title"/>
        </title>
        <link rel="stylesheet" href="berriak.css"/>
      </head>
    </html>
    <body>
      <header>
        <h1>
          <xsl:value-of select="$title"/>
        </h1>
        <p>
          Landareak gu bezalakoxeak dira: batzuk bestearekin ongi moldatzen dira eta beste batzuek elkar ikusi ere ezin
            dute.
        </p>
                <p>Naturala da. Barazkiak egoki elkartzeak ere onurak dakartza baratzera. 
                  <a href="#footer">kontaktua</a>
                </p>
        <h2>Nor norekin</h2>
      </header>
      
      <main>
        <div>
          <h2>Solanazeoak</h2>
          
          <xsl:for-each select="baratza/barazkia[familia ='Solanazeoak']">
                    <p><xsl:value-of select="izena"/></p>
          </xsl:for-each>          
          
        </div>
        <div>
          <h2>Liliazeoak</h2>
        </div>
        <div>
          <h2>Lekadunak</h2>
        </div>
        <div>
          <h2>Kurkubitazeoak</h2>
        </div>
      </main>
    </body>
    
  </xsl:template> 
  
</xsl:stylesheet>
