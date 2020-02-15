/*eslint-disable import/default */
/*eslint-disable import/namespace */

import React from 'react';
import img from './danger-man-at-work-hi.png';

class HomeMainInfo extends React.Component {
    render(){
        return(
            <div>
                <img src={img} alt="" width="400" height="400" />
            </div>
        );
    }
}

export default HomeMainInfo;