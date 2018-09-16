<<<<<<< HEAD
/*eslint-disable import/default */
/*eslint-disable import/namespace */

=======
>>>>>>> e2bcb607aaae22436399340e97c924878cfc1a79
import React, {PropTypes} from 'react';
import img from './danger-man-at-work-hi.png';

class HomeMainInfo extends React.Component {
    render(){
        return(
            <div>
                <img src={img} width="400" height="400" />
            </div>
        );
    }
}

export default HomeMainInfo;