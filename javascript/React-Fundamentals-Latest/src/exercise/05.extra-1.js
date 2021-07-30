import * as React from 'react'
import '../box-styles.css'

function Box({style, className = '', ...otherProps}) {
  return (
    <div
      className={`box ${className}`}
      style={{fontStyle: 'italic', ...style}}
      {...otherProps}
    ></div>
  )
}

function App() {
  return (
    <div>
      <Box className="box--small" style={{background: 'lightblue'}}>
        small lightblue box
      </Box>
      <Box className="box--medium" style={{background: 'pink'}}>
        medium pink box
      </Box>
      <Box className="box--large" style={{background: 'orange'}}>
        large orange box
      </Box>
      <Box>
        sizeless box
      </Box>
    </div>
  )
}

export default App
